package com.example.nftartdisplay;

public class NFT {
    private final String name;
    private final String url;

    public NFT(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}