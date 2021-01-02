package com.riseinsteps.packbagbuddy_leisuretravelandtourism;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.riseinsteps.packbagbuddy_leisuretravelandtourism.tour_description.Description;

import java.util.List;

public class MyAdventureAdapter extends RecyclerView.Adapter<MyAdventureAdapter.ViewHolder> {

List<Adventure_Data> my_list;
    Context context;

    public MyAdventureAdapter(List<Adventure_Data> my_list,Context context) {
        this.my_list=my_list;
        this.context=context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.adventure_trip_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Adventure_Data adventure_data= my_list.get(position);
        holder.location.setImageResource(adventure_data.getImage_id());
        holder.discount.setText(adventure_data.getDiscount());
        holder.title.setText(adventure_data.getTitle());
        holder.time.setText(adventure_data.getTime());
        holder.amount.setText(adventure_data.getAmount());
    }


    @Override
    public int getItemCount() {
        return my_list.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView location;
        public TextView discount;
        public TextView title;
        public TextView time;
        public TextView amount;
        public ViewHolder(View itemView) {
            super(itemView);
            location = (ImageView) itemView.findViewById(R.id.location);
            discount = (TextView) itemView.findViewById(R.id.discount);
            title = (TextView) itemView.findViewById(R.id.title);
            time = (TextView) itemView.findViewById(R.id.tours);
            amount = (TextView) itemView.findViewById(R.id.view_all);
            itemView.setOnClickListener((view)->{
                Intent intent=new Intent(context, Description.class);
                Adventure_Data adventure_data= my_list.get(getAdapterPosition());
                intent.putExtra("obj",adventure_data);
                context.startActivity(intent);
            });
        }
    }




}
