package com.example.user.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.user.myapplication.HelperClass.BottomNavigationViewHelper;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database;
    Button livecmtry;
    Button detailedscore;
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();


        toolbar = getSupportActionBar();
        toolbar.setTitle("Home");

        loadFragment(new HomeFragment());

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        BottomNavigationViewHelper.disableShiftMode(navigation);




    }

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_fixture:
                    toolbar.setTitle("Match info");

                    fragment = new FixtureFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_squard:
                    toolbar.setTitle("Squard");

                    fragment = new SquardFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_home:
                    toolbar.setTitle("Home");

                    fragment = new HomeFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_match:
                    toolbar.setTitle("Match");
                    fragment = new MatchFragment();
                    loadFragment(fragment);
                    return true;

            }
            return false;
        }
    };
}
