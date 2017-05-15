package com.example.wishchen.checkbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

public class TimePickerActivity extends AppCompatActivity {
    private TimePicker timePicker01;
    private DatePicker datePicker01;
    private Button nextBtn;
    private Button returnBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker);

        timePicker01 = (TimePicker)findViewById(R.id.timePicker01);
        datePicker01 = (DatePicker)findViewById(R.id.datePicker01);
        nextBtn = (Button)findViewById(R.id.nextId);
        returnBtn = (Button)findViewById(R.id.returnId);

        timePicker01.setIs24HourView(true);
        //设置24小时制
        timePicker01.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                System.out.println("time: "+ hourOfDay + ":" + minute);
            }
        });

        //跳转下一个activity
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TimePickerActivity.this,DatePickerActivity.class);
                startActivity(i);
            }
        });
        //返回上一个activity
        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(TimePickerActivity.this,MainActivity.class);
                startActivity(ii);
            }
        });
    }

}
