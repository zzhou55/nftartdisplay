package com.example.nftartdisplay;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class NFTAdapter extends RecyclerView.Adapter<NFTAdapter.NFTViewHolder> {
    private final List<NFT> nftList;

    public NFTAdapter(List<NFT> nftList) {
        this.nftList = nftList;
    }

    @NonNull
    @Override
    public NFTViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nft, parent, false);
        return new NFTViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NFTViewHolder holder, int position) {
        NFT nft = nftList.get(position);
        holder.nftName.setText(nft.getName());
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), DetailActivity.class);
            intent.putExtra("NFT_URL", nft.getUrl());
            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return nftList.size();
    }

    static class NFTViewHolder extends RecyclerView.ViewHolder {
        TextView nftName;

        public NFTViewHolder(@NonNull View itemView) {
            super(itemView);
            nftName = itemView.findViewById(R.id.nftName);
        }
    }
}