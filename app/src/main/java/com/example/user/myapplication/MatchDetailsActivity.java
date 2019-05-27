package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
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
import java.util.Date;
import java.util.TimeZone;

public class MatchDetailsActivity extends AppCompatActivity {

    String url="https://cricapi.com/api/fantasySummary?apikey=LP4zkm1KEcbeyfoCxz4fHmCagT93&unique_id=";
    String url1="https://cricapi.com/api/cricketScore?apikey=LP4zkm1KEcbeyfoCxz4fHmCagT93&unique_id=";
    TextView team1,team2,score,date1;
    TextView battingt1,battingt1detail,batting2,batting2detail;
    TextView bowlingt1,bowlingt1detail,bowling2,bowling2detail;
    TextView fieldingt1,fieldingt1detail,fielding2,fielding2detail;
   String TAG="MainSmmry";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_details);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Match Summary");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        Intent intent=getIntent();
        String id=intent.getStringExtra("matchid");
        String date=intent.getStringExtra("date");
         url=url+id;
        url1=url1+id;
         team1=findViewById(R.id.team1);
        team2=findViewById(R.id.team2);
        score=findViewById(R.id.Score);
        date1=findViewById(R.id.date);
       // description=findViewById(R.id.Description);
        battingt1=findViewById(R.id.battingt1);
        batting2=findViewById(R.id.battingt2);
        battingt1detail=findViewById(R.id.batting1detail);
        batting2detail=findViewById(R.id.battingt2detail);
        bowlingt1=findViewById(R.id.bowlingt1);
        bowling2=findViewById(R.id.bowlingt2);
        bowlingt1detail=findViewById(R.id.bowling1detail);
        bowling2detail=findViewById(R.id.bowlingt2detail);
        fieldingt1=findViewById(R.id.fieldingt1);
        fielding2=findViewById(R.id.fieldingt2);
        fieldingt1detail=findViewById(R.id.fieldingt1detail);
        fielding2detail=findViewById(R.id.fieldingt2detail);
        date1.setText(date);
       // loadtotalData();
        loadData();
        loadData1();
        Log.d("Matchsmmryid",url);


    }

    private void loadData1() {  StringRequest stringRequest=new StringRequest(Request.Method.GET, url1, new Response.Listener<String>() {
        @Override
        public void onResponse(String response) {
            try{
                JSONObject jsonObject=new JSONObject(response);

                String team1s=jsonObject.optString("team-1","");
                String team2s=jsonObject.optString("team-2","");
                String Matchst=jsonObject.optString("matchStarted","'");

                team1.setText(team1s);
                team2.setText(team2s);
                if(Matchst.equals("true")) {
                    try {

                        String Scores =jsonObject.optString("score","");

                        score.setText(Scores);


                    } catch (Exception e){
                        Toast.makeText(MatchDetailsActivity.this,""+e.getMessage(),Toast.LENGTH_SHORT);
                    }
                }
                else{ score.setText("N/A");
                    }








            }
            catch (Exception e){
                Log.d(TAG,"Error4");
                Toast.makeText(MatchDetailsActivity.this,""+e.getMessage(),Toast.LENGTH_SHORT);
            }
        }
    }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(VolleyError error) {
            Toast.makeText(MatchDetailsActivity.this, "Error"+ error.toString(), Toast.LENGTH_SHORT).show();
        }
    });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);


    }




    private void loadData() {

        StringRequest stringRequest=new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("rn","rn");
                try{
                    JSONObject jsonObject=new JSONObject(response);
                    JSONObject dataObject=jsonObject.getJSONObject("data");
                    JSONArray fieldArray=dataObject.getJSONArray("fielding");

                    JSONObject field1=fieldArray.optJSONObject(0);
                    JSONObject field2=fieldArray.optJSONObject(1);

                    String field1title=field1.getString("title");

                    JSONArray field1score=field1.getJSONArray("scores");

                    fieldingt1.setText(field1title);

                    Log.d("rn","rn");
                    for (int i=0;i<field1score.length();i++)
                    {    try{Log.d("rn","rn");
                        String name=field1score.getJSONObject(i).optString("name","");
                        String bowled=field1score.getJSONObject(i).optString("bowled","");
                        String catchh=field1score.getJSONObject(i).optString("catch","");
                        String lbw=field1score.getJSONObject(i).optString("lbw","");
                        String runout=field1score.getJSONObject(i).optString("runout","");
                        String stump=field1score.getJSONObject(i).optString("stumped","");
                        fieldingt1detail.append("Name:"+name+"\tBowled:"+bowled+"\tCatch:"+catchh+"\tLBW:"+lbw+"\tRunout:"+runout+"\tStumped"+stump+"\n\n");
                        Log.d("Team1","Name:"+name+"\tBowled:"+bowled+"\tCatch:"+catchh+"\tLBW:"+lbw+"\tRunout:"+runout+"\tStumped"+stump+"\n\n");}
                        catch(Exception e){}


                    }
                    if(field2!=null) {
                        String field2title = field2.getString("title");
                        JSONArray field2score = field2.getJSONArray("scores");
                        fielding2.setText(field2title);
                        for (int i = 0; i < field2score.length(); i++) {
                            Log.d("rn", "rn");
                            String name=field1score.getJSONObject(i).optString("name","");
                            String bowled=field1score.getJSONObject(i).optString("bowled","");
                            String catchh=field1score.getJSONObject(i).optString("catch","");
                            String lbw=field1score.getJSONObject(i).optString("lbw","");
                            String runout=field1score.getJSONObject(i).optString("runout","");
                            String stump=field1score.getJSONObject(i).optString("stumped","");
                            fielding2detail.append("Name:" + name + "\tBowled:" + bowled + "\tCatch:" + catchh + "\tLBW:" + lbw + "\tRunout:" + runout + "\tStumped" + stump + "\n\n");
                            Log.d("Team2", "Name:" + name + "\tBowled:" + bowled + "\tCatch:" + catchh + "\tLBW:" + lbw + "\tRunout:" + runout + "\tStumped" + stump + "\n\n");


                        }
                    }
                    JSONArray battingArray=dataObject.getJSONArray("batting");
                    JSONObject bat1=battingArray.optJSONObject(0);

                    String bat1title=bat1.getString("title");

                    JSONArray bat1score=bat1.getJSONArray("scores");

                    battingt1.setText(bat1title);

                    for (int i=0;i<bat1score.length();i++)
                    {    Log.d("rn","rn");
                        String name=bat1score.getJSONObject(i).optString("batsman","");
                        String SR=bat1score.getJSONObject(i).optString("SR","");
                        String dismissal=bat1score.getJSONObject(i).optString("dismissal","");
                      //  String dismissal = obj.optString(fieldName, defaultValueIfNull);
                        String six=bat1score.getJSONObject(i).optString("6s","");
                        String fors=bat1score.getJSONObject(i).optString("4s","");
                        String balls=bat1score.getJSONObject(i).optString("B","");
                        String runs=bat1score.getJSONObject(i).optString("R","");
                        battingt1detail.append("Name:"+name+"\tRuns:"+runs+"\tBalls Played"+balls+"\tDismissal"+dismissal+"\tStrike rate:"+SR+"\t6s"+six+"\t4s"+fors+"\n\n");
                        Log.d("Team1","Name:"+name+"\tRuns:"+runs+"\tBalls Played"+balls+"\tDismissal"+dismissal+"\tStrike rate:"+SR+"\t6s"+six+"\t4s"+fors+"\n\n");


                    }

                    JSONObject bat2=battingArray.optJSONObject(1);
                    if(bat2!=null) {
                        JSONArray bat2score = bat2.getJSONArray("scores");
                        String bat2title = bat2.getString("title");
                        batting2.setText(bat2title);

                        for (int i = 0; i < bat2score.length(); i++) {
                            Log.d("rn", "rn");
                            String name=bat1score.getJSONObject(i).optString("batsman","");
                            String SR=bat1score.getJSONObject(i).optString("SR","");
                            String dismissal=bat1score.getJSONObject(i).optString("dismissal","");
                            //  String dismissal = obj.optString(fieldName, defaultValueIfNull);
                            String six=bat1score.getJSONObject(i).optString("6s","");
                            String fors=bat1score.getJSONObject(i).optString("4s","");
                            String balls=bat1score.getJSONObject(i).optString("B","");
                            String runs=bat1score.getJSONObject(i).optString("R","");
                            batting2detail.append("Name:" + name + "\tRuns:" + runs + "\tBalls Played" + balls + "\tDismissal" + dismissal + "\tStrike rate:" + SR + "\t6s" + six + "\t4s" + fors + "\n\n");
                            Log.d("Team1", "Name:" + name + "\tRuns:" + runs + "\tBalls Played" + balls + "\tDismissal" + dismissal + "\tStrike rate:" + SR + "\t6s" + six + "\t4s" + fors + "\n\n");


                        }
                    }

                    JSONArray bowlingArray=dataObject.getJSONArray("bowling");

                    JSONObject bowl1=bowlingArray.optJSONObject(0);
                    JSONObject bowl2=bowlingArray.optJSONObject(1);

                    String bowl1title=bowl1.getString("title");

                    JSONArray bowl1score=bowl1.getJSONArray("scores");

                    bowlingt1.setText(bowl1title);

                    Log.d("rn","rn");
                    for (int i=0;i<bowl1score.length();i++)
                    {    try{Log.d("rn","rn");
                        //{"6s":0,"4s":2,"0s":18,"Econ":"4.50","W":"1","R":"27","M":"0","O":"6","bowler":"A Zampa","pid":"379504"}
                        String name=bowl1score.getJSONObject(i).optString("bowler","");
                        String overs=bowl1score.getJSONObject(i).optString("O","");
                        String maiden=bowl1score.getJSONObject(i).optString("M","");
                        String rns=bowl1score.getJSONObject(i).optString("R","");
                        String wides=bowl1score.getJSONObject(i).optString("W","");
                        String economy=bowl1score.getJSONObject(i).optString("Econ","");
                        String dotballs=bowl1score.getJSONObject(i).optString("0s","");
                        String sixes=bowl1score.getJSONObject(i).optString("6s","");
                        String fors=bowl1score.getJSONObject(i).optString("4s","");
                        bowlingt1detail.append("Name:"+name+"\tOvers:"+overs+"\tmaiden"+maiden+"\tRuns"+rns+"\twides:"+wides+"\tEconomy"+economy+"\tdotballs"+dotballs+"\t6s"+sixes+"\tFours:"+fors+"\n\n");
                       // Log.d("Team1","Name:"+name+"\tBowled:"+bowled+"\tCatch:"+catchh+"\tLBW:"+lbw+"\tRunout:"+runout+"\tStumped"+stump+"\n\n");
                    }
                    catch(Exception e){}


                    }
                    if(bowl2!=null) {
                        String bowl2title = bowl2.getString("title");
                        JSONArray bowl2score = bowl2.getJSONArray("scores");
                        bowling2detail.setText(bowl2title);
                        for (int i = 0; i < bowl2score.length(); i++) {
                            Log.d("rn", "rn");
                            String name=bowl2score.getJSONObject(i).optString("bowler","");
                            String overs=bowl2score.getJSONObject(i).optString("O","");
                            String maiden=bowl2score.getJSONObject(i).optString("M","");
                            String rns=bowl2score.getJSONObject(i).optString("R","");
                            String wides=bowl2score.getJSONObject(i).optString("W","");
                            String economy=bowl2score.getJSONObject(i).optString("Econ","");
                            String dotballs=bowl2score.getJSONObject(i).optString("0s","");
                            String sixes=bowl2score.getJSONObject(i).optString("6s","");
                            String fors=bowl2score.getJSONObject(i).optString("4s","");
                            bowling2detail.append("Name:"+name+"\tOvers:"+overs+"\tmaiden"+maiden+"\tRuns"+rns+"\twides:"+wides+"\tEconomy"+economy+"\tdotballs"+dotballs+"\t6s"+sixes+"\tFours:"+fors+"\n\n");

                        }
                    }




                }
                catch (Exception e){
                    Log.d("exception",""+e.getMessage());
                    Log.d(TAG,"Error4");
                    Toast.makeText(MatchDetailsActivity.this,""+e.getMessage(),Toast.LENGTH_SHORT);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MatchDetailsActivity.this, "Error"+ error.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);


    }


    @Override
    public  boolean onSupportNavigateUp()
    {onBackPressed();
    return super.onSupportNavigateUp();}
}
