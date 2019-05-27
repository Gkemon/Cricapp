package com.example.user.myapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class FixtureFragment extends Fragment {
    private String url="http://cricapi.com/api/matches/?apikey=LP4zkm1KEcbeyfoCxz4fHmCagT93";
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private List<Model> modelList;
    public String TAG="Errorcheck";

    @Override
    public
    View onCreateView(LayoutInflater inflater, ViewGroup container,
                      Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.activity_main3, container, false);

        mRecyclerView=root.findViewById(R.id.recycle);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        modelList=new ArrayList<>();

        mAdapter=new MyAdapter(modelList,getContext());
        mRecyclerView.setAdapter(mAdapter);

        loaddata();
        return root;
    }



    private void loaddata() {

        StringRequest stringRequest=new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try{
                    JSONArray jsonArray=new JSONObject(response).getJSONArray("matches");
                    Log.d(TAG,"Error1");
                    for(int i = 0; i<jsonArray.length(); i++)
                    {        Log.d(TAG,"Error2");

                        String ID=jsonArray.getJSONObject(i).getString("unique_id");
                        String team1=jsonArray.getJSONObject(i).getString("team-1");
                        String team2=jsonArray.getJSONObject(i).getString("team-2");
                        String matchType=jsonArray.getJSONObject(i).getString("type");
                        String matchStat=jsonArray.getJSONObject(i).getString("matchStarted");
                        String date=jsonArray.getJSONObject(i).getString("dateTimeGMT");
                        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                        format.setTimeZone(TimeZone.getTimeZone(date));
                        Date date1=format.parse(date);
                        SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy HH:mm");
                        format1.setTimeZone(TimeZone.getTimeZone("GMT"));
                        String date2=format1.format(date1);
                        Model model=new Model(ID,team1,team2,matchType,matchStat,date2);
                        modelList.add(model);
                        Log.d(TAG,team1+team2+matchType);
                        mAdapter.notifyDataSetChanged();




                    }

                }
                catch (Exception e){
                    Log.d(TAG,"Error4");
                    Toast.makeText(getContext(),""+e.getMessage(),Toast.LENGTH_SHORT);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getContext(), "Error"+ error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(getContext());
        requestQueue.add(stringRequest);


    }

}

