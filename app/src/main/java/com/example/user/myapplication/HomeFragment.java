package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public
class HomeFragment extends Fragment {




    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public
    View onCreateView(LayoutInflater inflater, ViewGroup container,
                      Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_home, container, false);

       View livecmtry=(Button)root.findViewById(R.id.register);
        livecmtry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in1=new Intent(getActivity(), CommentryActivity.class);
                startActivity(in1);

            }

        });

        return root;
    }


}
