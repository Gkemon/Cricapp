package com.example.user.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MyAdapter2 extends RecyclerView.Adapter<Viewholder2>{
List <Model2> modelList;
     Context context;

    public MyAdapter2(List<Model2> modelList, Context context) {

        this.modelList = modelList;
        this.context = context;
    }





    @Override
    public Viewholder2 onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.commentry, parent, false);//this is to tell the layout of each item
        return new Viewholder2(v);


    }


    public void onBindViewHolder(Viewholder2 holder, int position) {
        Model2 model2=modelList.get(position);
        holder.overs.setText(model2.getOvers());
        holder.commentry.setText(model2.getCommentry());
      Log.d("Adater",model2.getCommentry());


    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}

