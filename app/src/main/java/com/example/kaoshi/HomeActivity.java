package com.example.kaoshi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {


    private ViewPager viewpager;
    private RadioButton shouye;
    private ArrayList<Fragment> list;
    private RadioButton name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
        initData();

    }

    private void initData() {
        list = new ArrayList<Fragment>();
        list.add(new ShouyeFragment());
    }

    private void initView() {

        viewpager = (ViewPager) findViewById(R.id.viewpager);


        name = (RadioButton) findViewById(R.id.name);
     name.setOnClickListener(new View.OnClickListener() {
         private MyAdapter adapter;

         @Override
         public void onClick(View view) {
             MyAdapter adapter =  new MyAdapter(getSupportFragmentManager(), list);
             viewpager.setAdapter(adapter);
         }

     });
    }

}
