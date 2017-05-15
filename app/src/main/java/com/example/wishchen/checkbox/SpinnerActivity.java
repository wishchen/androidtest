package com.example.wishchen.checkbox;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    private Spinner spinnerId ,spinnerId02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinnerId = (Spinner)findViewById(R.id.spinnerId);
        spinnerId02 = (Spinner)findViewById(R.id.spinnerId02);
        //通过createResource方法创建一个ArrayAdapt对象
        //第一个参数获取上下文对象
        //第二个参数引用了res/values/strings.xml中定义的数组
        //第三个参数用来指定spinner的样式,是一个布局文件id,也可替换自定义的布局文件
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.spinner_array,
                android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //设置spinner每个条目的样式
        spinnerId.setAdapter(adapter);
        spinnerId.setPrompt("看看行不行");

        SpinnerListener spl = new SpinnerListener();
        spinnerId.setOnItemSelectedListener(spl);

        //通过list赋值给adapter
        List<String> list = new ArrayList<String>();
        list.add("第一个下拉内容");
        list.add("第二个下拉内容");
        //第一个参数获取上下文对象
        //第二个参数指定下拉菜单每个条目的样式
        //第三个参数指定TextView的id
        //地四个参数为整个列表提供数据
        ArrayAdapter adapter02 = new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,list);

        spinnerId02.setAdapter(adapter02);
        spinnerId02.setPrompt("有没有");

    }
    class SpinnerListener implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String selected = parent.getItemAtPosition(position).toString();
//            System.out.println(selected);
            Toast.makeText(getApplicationContext(),selected,Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            Toast.makeText(getApplicationContext(),"什么也没有选中", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String selected = parent.getItemAtPosition(position).toString();
//            System.out.println(selected);
            Toast.makeText(getApplicationContext(),selected + " clicked",Toast.LENGTH_SHORT).show();
        }
    }

}
