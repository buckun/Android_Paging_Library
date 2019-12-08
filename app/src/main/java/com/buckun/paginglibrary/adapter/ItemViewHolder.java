package com.buckun.paginglibrary.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.buckun.paginglibrary.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView textView;


    public ItemViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.textViewName);
    }
}
