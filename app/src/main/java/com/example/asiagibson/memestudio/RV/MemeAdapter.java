package com.example.asiagibson.memestudio.RV;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.asiagibson.memestudio.Activities.GalleryActivity;
import com.example.asiagibson.memestudio.R;

import java.util.Arrays;
import java.util.List;

/**
 * Created by asiagibson on 1/19/17.
 */

public class MemeAdapter extends RecyclerView.Adapter<MemeViewHolder>{
    public Context context;

    private List<Integer> mMemeList = Arrays.asList(
            R.drawable.brushicon,
            R.drawable.delete,
            R.drawable.dropper,
            R.drawable.eraser,
            R.drawable.brushicon,
            R.drawable.delete,
            R.drawable.dropper,
            R.drawable.eraser


    );


    @Override
    public MemeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_meme_view,parent,false);
        return new MemeViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MemeViewHolder holder, final int position) {

        final Integer holderMeme = mMemeList.get(position);
        holder.bind(holderMeme);

    }

    @Override
    public int getItemCount() {
        return mMemeList.size();
    }
}