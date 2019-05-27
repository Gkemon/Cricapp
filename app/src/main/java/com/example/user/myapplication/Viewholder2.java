package com.example.user.myapplication;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Viewholder2 extends RecyclerView.ViewHolder {

    TextView overs,commentry;

    public Viewholder2 (View itemView) {
        super(itemView);
        overs=itemView.findViewById(R.id.overs);
        commentry=itemView.findViewById(R.id.commentry);



    }

}



/*  itemView.findViewById(R.id.team1TV);
            itemView.findViewById(R.id.team2TV);
            itemView.findViewById(R.id.matchtypeTV);
            itemView.findViewById(R.id.MatchsTV);
            itemView.findViewById(R.id.DateTv);
            itemView.findViewById(R.id.cardview)*/