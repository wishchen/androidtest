package com.example.wishchen.checkbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ProgressBar;

public class ProgressBarActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private Button increaseProBar,increaseSecBar,return03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        increaseProBar = (Button)findViewById(R.id.increaseId);
        increaseSecBar = (Button)findViewById(R.id.increaseSecId);
        return03 = (Button)findViewById(R.id.returnId03);

        increaseProBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                progressBar.setProgress(10);
//                设置进度
                progressBar.incrementProgressBy(10);
//                设置每次增加进度
            }
        });
        increaseSecBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                progressBar.setSecondaryProgress(10);
                progressBar.incrementSecondaryProgressBy(10);
//                设置二次进度每次增加值
            }
        });
        return03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ProgressBarActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }


}
