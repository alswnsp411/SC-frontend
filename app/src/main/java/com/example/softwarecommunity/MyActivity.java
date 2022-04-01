package com.example.softwarecommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ImageButton backbtn=(ImageButton)findViewById(R.id.backbtn);
        backbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent= new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);

                return false;
            }
        });

        //수강 과목 관리 버튼
        Button manageobjbtn=(Button) findViewById(R.id.manageobjbtn);
        manageobjbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), ManageObjActivity.class);
                startActivity(intent);
            }
        });
    }
}