package com.example.nftartdisplay;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class DetailActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        // Set up the toolbar with back button
        setupToolbarWithBackButton(R.id.toolbar);

        String nftUrl = getIntent().getStringExtra("NFT_URL");
        WebView webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();

        // Enable JavaScript if needed (optional)
        webSettings.setJavaScriptEnabled(true);

        // Set WebView settings to adjust the image to fit the screen
        webSettings.setUseWideViewPort(true); // Allows the WebView to fit content to the viewport
        webSettings.setLoadWithOverviewMode(true); // Loads the WebView completely zoomed out

        // Make sure the WebView content stays within its bounds
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(nftUrl);
    }
}