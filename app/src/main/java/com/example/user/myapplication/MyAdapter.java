package com.example.user.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<Viewholder>{
    private List <Model> modelList;
    private Context context;

    public MyAdapter(List<Model> modelList, Context context) {

        this.modelList = modelList;
        this.context = context;
    }





    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row, parent, false);//this is to tell the layout of each item
        return new Viewholder(v);


    }


    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
    final Model model=modelList.get(position);
    holder.team1tv.setText(model.getTeam1());
        holder.team2tv.setText(model.getTeam2());
        holder.matchtypetv.setText(model.getMatchtype());
        //holder.matchstattv.setText(model.getMatchstatus());
        holder.datetv.setText(model.getDate());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String matchid=model.getId();
                Intent intent= new Intent(context,MatchDetailsActivity.class);
                intent.putExtra("matchid",matchid);
                intent.putExtra("date",model.getDate());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
               context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }
}

