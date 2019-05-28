package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public
class SquardDetails extends AppCompatActivity {

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squard_details);

        TextView textView = findViewById(R.id.details);
        textView.setText(getIntent().getStringExtra("data"));
    }
}
