package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class ViewHolder extends RecyclerView.ViewHolder {

    public AppCompatImageView myImage;
    public TextView textViewName;
    public TextView textViewDescription;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        myImage = itemView.findViewById(R.id.imageview_ID);
        textViewName = itemView.findViewById(R.id.name_textview_ID);
        textViewDescription = itemView.findViewById(R.id.desc_textview_ID);
    }
}