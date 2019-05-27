package com.example.user.myapplication;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Viewholder extends RecyclerView.ViewHolder {

    TextView team1tv,team2tv,matchtypetv,matchstattv,datetv;
    CardView cardView;

    public Viewholder (View itemView) {
        super(itemView);
        team1tv=itemView.findViewById(R.id.team1TV);
        team2tv=itemView.findViewById(R.id.team2TV);
        matchtypetv=itemView.findViewById(R.id.matchtypeTV);
        //matchstattv=itemView.findViewById(R.id.MatchsTV);
        datetv=itemView.findViewById(R.id.DateTv);
        cardView=itemView.findViewById(R.id.cardview);


    }

}



/*  itemView.findViewById(R.id.team1TV);
            itemView.findViewById(R.id.team2TV);
            itemView.findViewById(R.id.matchtypeTV);
            itemView.findViewById(R.id.MatchsTV);
            itemView.findViewById(R.id.DateTv);
            itemView.findViewById(R.id.cardview)*/