package com.example.kaoshi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(in);
                overridePendingTransition(R.anim.tran1,R.anim.tran2);
            }


        });
    }

    private void initView() {
        img = (ImageView) findViewById(R.id.img);
    }
}
