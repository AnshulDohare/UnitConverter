package com.example.unitconverter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    public ArrayList<ListItems> list;
    ItemClicked activity;
    public interface ItemClicked{
        void onItemClicked(int index);
    }

    public ItemAdapter(ArrayList<ListItems> list, Context activity) {
        this.list = list;
        this.activity =(ItemClicked) activity;
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_layout,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        holder.itemView.setTag(list.get(position));
        holder.itemText.setText(list.get(position).getName());
        switch (list.get(position).getImage()){
            case 1:holder.itemImage.setImageResource(R.drawable.length);break;
            case 2:holder.itemImage.setImageResource(R.drawable.area);break;
            case 3:holder.itemImage.setImageResource(R.drawable.volume);break;
            case 4:holder.itemImage.setImageResource(R.drawable.speed);break;
            case 5:holder.itemImage.setImageResource(R.drawable.weight);break;
            case 6:holder.itemImage.setImageResource(R.drawable.temperature);break;
            case 7:holder.itemImage.setImageResource(R.drawable.power);break;
            case 8:holder.itemImage.setImageResource(R.drawable.pressure);break;
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView itemText;
        ImageView itemImage;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemText = itemView.findViewById(R.id.textItem);
            itemImage = itemView.findViewById(R.id.imgItem);

            itemView.setOnClickListener(v -> activity.onItemClicked(list.indexOf((ListItems) v.getTag())));
        }
    }
}
