package com.hanbit.reservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    RadioButton rdCalendar, rdClock;
    CalendarView cvSet;
    TimePicker tpSet;
    Button btSet;
    TextView year, month, day, hour, minut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdCalendar = (RadioButton) findViewById(R.id.rdCalendar);
        rdClock = (RadioButton) findViewById(R.id.rdClock);

        cvSet = (CalendarView) findViewById(R.id.cvSet);
        tpSet = (TimePicker) findViewById(R.id.tpSet);

        btSet = (Button) findViewById(R.id.btSet);

        year = (TextView) findViewById(R.id.year);
        month = (TextView) findViewById(R.id.month);
        day = (TextView) findViewById(R.id.day);
        hour = (TextView) findViewById(R.id.hour);
        minut = (TextView) findViewById(R.id.minut);

        cvSet.setVisibility(View.INVISIBLE);
        tpSet.setVisibility(View.INVISIBLE);

        rdCalendar.setOnClickListener(this);
        rdClock.setOnClickListener(this);
        btSet.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rdCalendar:
                tpSet.setVisibility(View.INVISIBLE);
                cvSet.setVisibility(View.VISIBLE);
                break;
            case R.id.rdClock:
                tpSet.setVisibility(View.VISIBLE);
                cvSet.setVisibility(View.INVISIBLE);
                break;

        }


    }
}
