package com.wanderlust.app.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wanderlust.app.R;
import com.wanderlust.app.model.RecentsData;

import java.util.List;

public class RecentsAdapter extends RecyclerView.Adapter<>{

    Context context;
    List<RecentsData> recentsDataList;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.,parent,false);
        return new RecentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return recentsDataList.size();
    }


    public static final class RecentsViewHolder extends RecyclerView.ViewHolder{

        public RecentsViewHolder(@NonNull View itemView){
            super(itemView);
        }
    }
}
