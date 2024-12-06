package com.example.nftartdisplay;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class HomeActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Set up the toolbar with back button
        setupToolbarWithBackButton(R.id.toolbar);

        // Sample implementation to list NFTs (dummy data)
        RecyclerView nftRecyclerView = findViewById(R.id.nftRecyclerView);
        nftRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<NFT> nftList = Arrays.asList(
                new NFT("BoredApeYachtClub #4405", "https://images.blur.io/_blur-prod/0xbc4ca0eda7647a8ab7c2061c2e118a18a936f13d/4405-21a41f1cd7130768?w=512"),
                new NFT("BoredApeYachtClub #4711", "https://images.blur.io/_blur-prod/0xbc4ca0eda7647a8ab7c2061c2e118a18a936f13d/4711-00844ded09095df4?w=512"),
                new NFT("BoredApeYachtClub #6038", "https://images.blur.io/_blur-prod/0xbc4ca0eda7647a8ab7c2061c2e118a18a936f13d/6038-a0336758c3c94df8?w=512"),
                new NFT("BoredApeYachtClub #3811", "https://images.blur.io/_blur-prod/0xbc4ca0eda7647a8ab7c2061c2e118a18a936f13d/3811-969abeabfb08edf6?w=512"),
                new NFT("BoredApeYachtClub #5101", "https://images.blur.io/_blur-prod/0xbc4ca0eda7647a8ab7c2061c2e118a18a936f13d/5101-22f99d487904c703?w=512")
        );
        NFTAdapter nftAdapter = new NFTAdapter(nftList);
        nftRecyclerView.setAdapter(nftAdapter);
    }
}