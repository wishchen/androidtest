package com.example.wishchen.checkbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DatePickerActivity extends AppCompatActivity {
    private Button nextBtn02;
    private Button returnBtn02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);

        nextBtn02 = (Button)findViewById(R.id.nextId02);
        returnBtn02 = (Button)findViewById(R.id.returnId02);

        nextBtn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"最后一页了!",Toast.LENGTH_SHORT).show();

            }
        });
        returnBtn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DatePickerActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }

}
