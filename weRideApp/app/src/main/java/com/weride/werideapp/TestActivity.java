package com.weride.werideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        RideInfo rideInfo = (RideInfo)getIntent().getSerializableExtra("rideInfo");
        TextView tv = (TextView)findViewById(R.id.nameView);
        tv.setText(rideInfo.raceName);
        tv = (TextView)findViewById(R.id.dateView);
        tv.setText(rideInfo.dateTime.getTime().toString());
    }
}
