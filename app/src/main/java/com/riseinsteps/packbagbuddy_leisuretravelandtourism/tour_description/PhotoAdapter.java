package com.riseinsteps.packbagbuddy_leisuretravelandtourism.tour_description;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.riseinsteps.packbagbuddy_leisuretravelandtourism.Adventure_Data;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.MyAdventureAdapter;
import com.riseinsteps.packbagbuddy_leisuretravelandtourism.R;

import java.util.List;


public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {
    List<Integer> photo;
    public PhotoAdapter(List<Integer> photo){
        this.photo=photo;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.photo_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.location.setImageResource(photo.get(position));

    }

    @Override
    public int getItemCount() {
        return photo.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView location;


        public ViewHolder(View itemView) {
            super(itemView);
            location = (ImageView) itemView.findViewById(R.id.location);


        }
    }
}
