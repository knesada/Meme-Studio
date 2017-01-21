package com.example.asiagibson.memestudio.RV;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asiagibson.memestudio.Activities.GalleryActivity;
import com.example.asiagibson.memestudio.R;

/**
 * Created by asiagibson on 1/19/17.
 */

public class MemeViewHolder extends RecyclerView.ViewHolder {
    public Context context;

    ImageView memeType;

    public MemeViewHolder(View view) {
        super(view);
        context = view.getContext();


        memeType = (ImageView) itemView.findViewById(R.id.iv_meme_type);


        memeType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"At this  " + getAdapterPosition(),Toast.LENGTH_SHORT).show();

                final Intent intent;
                switch (getAdapterPosition()){
                    case 0:
                       intent = new Intent(context,GalleryActivity.class);
                        context.startActivity(intent);

                        break;

//                    case 1:
//                        intent = new Intent(context,GalleryActivity.class);
//                        break;
//
//                    case 2:
//                        intent = new Intent(context,GalleryActivity.class);
//                        break;


                }
            }
        });
    }

    public void bind(Integer holderMeme){
        memeType.setImageResource(holderMeme);
    }
}