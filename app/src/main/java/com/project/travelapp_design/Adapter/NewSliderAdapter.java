package com.project.travelapp_design.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.travelapp_design.Model.InfoModel;
import com.project.travelapp_design.R;

import java.util.List;

public class NewSliderAdapter extends RecyclerView.Adapter<NewSliderAdapter.ViewHolder> {

    List<InfoModel> infoModels;
    private Context context;

    public NewSliderAdapter(List<InfoModel> infoModels, Context context) {
        this.infoModels = infoModels;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View rootview = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_horizontal_slider, parent, false);
        return new ViewHolder(rootview);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final InfoModel infoModel = infoModels.get(position);
        holder.imageView.setImageResource(Integer.parseInt(String.valueOf(infoModels.get(position).getImages())));
    }

    @Override
    public int getItemCount() {
        return infoModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.newdestinationimage);

        }
    }
}
