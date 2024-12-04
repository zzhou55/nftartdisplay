package com.example.nftartdisplay;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String nftUrl = getIntent().getStringExtra("NFT_URL");
        WebView webView = findViewById(R.id.webView);
        webView.loadUrl(nftUrl);
    }
}