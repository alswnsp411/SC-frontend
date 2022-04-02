package com.example.softwarecommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //마이페이지 버튼
        ImageButton mybtn=(ImageButton) findViewById(R.id.mybtn);
        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MyActivity.class);
                startActivity(intent);
            }
        });

        //과목버튼
        Button subjectsbtn= (Button) findViewById(R.id.subjectsbtn);
        subjectsbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent= new Intent(getApplicationContext(), SubjectsActivity.class);
                startActivity(intent);
                return false;
            }
        });
    }
}