package com.example.wishchen.checkbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private CheckBox lisSing;
    private CheckBox movie;
    private CheckBox swim;
    private CheckBox running;
    private CheckBox sleep;
    private CheckBox checkedall;
    private RadioGroup sexRadioGroup;
    private ImageView imageView;
    private Button redirectBtn;
    private Button progressBarBtn;
    private Button spinnerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //通过id获取到每个控件
        lisSing = (CheckBox)findViewById(R.id.lisSing);
        movie = (CheckBox)findViewById(R.id.movie);
        swim = (CheckBox)findViewById(R.id.swim);
        running = (CheckBox)findViewById(R.id.running);
        sleep = (CheckBox)findViewById(R.id.sleep);
        checkedall = (CheckBox)findViewById(R.id.checkedall);
        sexRadioGroup = (RadioGroup)findViewById(R.id.radioGroupId);

//        imageView = (ImageView)findViewById(R.id.imageView01);

        redirectBtn = (Button)findViewById(R.id.redirect);
        progressBarBtn = (Button)findViewById(R.id.progressBarBtn);

        spinnerBtn = (Button)findViewById(R.id.spinnerBtn);

        //创建一个监听对象
        OnClickChangeListener listener = new OnClickChangeListener();
        lisSing.setOnCheckedChangeListener(listener);
        movie.setOnCheckedChangeListener(listener);
        swim.setOnCheckedChangeListener(listener);
        running.setOnCheckedChangeListener(listener);
        sleep.setOnCheckedChangeListener(listener);
        checkedall.setOnCheckedChangeListener(listener);

        RadioButtonList radioLis = new RadioButtonList();
        sexRadioGroup.setOnCheckedChangeListener(radioLis);

        redirectBtn.setOnClickListener(new View.OnClickListener() {
            //activity 跳转
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, TimePickerActivity.class);
                startActivity(i);

            }
        });
        progressBarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ProgressBarActivity.class);
                startActivity(i);
            }
        });
        spinnerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SpinnerActivity.class);
                startActivity(i);
            }
        });

        //setImageResource 设置图片路径
        //imageView.setImageResource(R.drawable.rabbit);
        //imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
/*
* 创建监听方法 实现OnCheckedChangeListener方法
* 控件状态改变 监听  OnCheckedChangeListener
* 点击控件监听 OnClickListener
* */
    class OnClickChangeListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton checkView, boolean isChecked) {
            if(checkView.getId() == R.id.lisSing){
                System.out.println("听歌");
            }else if(checkView.getId() == R.id.movie){
                System.out.println("看电影");
            }else if(checkView.getId() == R.id.swim){
                System.out.println("游泳");
            }else if(checkView.getId() == R.id.running){
                System.out.println("跑步");
            }else if(checkView.getId() == R.id.sleep){
                System.out.println("睡觉");
            }else if(checkView.getId() == R.id.checkedall){
                System.out.println("全选");
            }

            if(isChecked == true){
                System.out.println("被选中");
            }else{
                System.out.println("取消选中");
            }
            CheckBox lisSing = (CheckBox)findViewById(R.id.lisSing);
            CheckBox movie = (CheckBox)findViewById(R.id.movie);
            CheckBox swim = (CheckBox)findViewById(R.id.swim);
            CheckBox running = (CheckBox)findViewById(R.id.running);
            CheckBox sleep = (CheckBox)findViewById(R.id.sleep);
            CheckBox checkedall = (CheckBox)findViewById(R.id.checkedall);
            if(checkView.getId() == R.id.checkedall && isChecked == true){
                lisSing.setChecked(true);
                movie.setChecked(true);
                swim.setChecked(true);
                running.setChecked(true);
                sleep.setChecked(true);
            }else if(checkView.getId() == R.id.checkedall && isChecked == false){
                lisSing.setChecked(false);
                movie.setChecked(false);
                swim.setChecked(false);
                running.setChecked(false);
                sleep.setChecked(false);
            }
        }
    }
    class RadioButtonList implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if(group.getId() == R.id.radioGroupId){
                System.out.println("radio group was clicked");
            }
        }
    }
}
