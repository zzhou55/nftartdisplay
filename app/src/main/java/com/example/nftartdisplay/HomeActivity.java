package com.example.nftartdisplay;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Sample implementation to list NFTs (dummy data)
        RecyclerView nftRecyclerView = findViewById(R.id.nftRecyclerView);
        nftRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<NFT> nftList = Arrays.asList(
                new NFT("Artwork 1", "https://example.com/art1"),
                new NFT("Artwork 2", "https://example.com/art2")
        );
        NFTAdapter nftAdapter = new NFTAdapter(nftList);
        nftRecyclerView.setAdapter(nftAdapter);
    }
}