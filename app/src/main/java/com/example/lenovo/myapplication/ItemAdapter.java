package com.example.lenovo.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 10/20/2016.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {

    private List<ItemModel> mDataSet = new ArrayList<>();

    public ItemAdapter(List<ItemModel> mDataSet) {
        this.mDataSet = mDataSet;
    }

    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);

        return new ItemAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemAdapter.ViewHolder holder, int position) {

        ItemModel itemModel = mDataSet.get(position);
        holder.thumbnails.setImageResource(itemModel.getThumbnail());
        holder.film_name.setText(itemModel.getName());
        holder.film_info.setText(itemModel.getInfo());


    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView thumbnails, pop_up_menu;
        TextView film_name, film_info;

        public ViewHolder(View itemView) {
            super(itemView);

            thumbnails = (ImageView) itemView.findViewById(R.id.thumbnail);
            pop_up_menu = (ImageView) itemView.findViewById(R.id.overflow);
            film_name = (TextView) itemView.findViewById(R.id.film_name);
            film_info = (TextView) itemView.findViewById(R.id.film_info);


        }
    }

}
