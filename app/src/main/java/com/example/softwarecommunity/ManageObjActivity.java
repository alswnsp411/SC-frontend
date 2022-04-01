package com.example.softwarecommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class ManageObjActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_obj);

        ImageButton backbtn=(ImageButton)findViewById(R.id.backbtn);
        backbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent= new Intent(getApplicationContext(), MyActivity.class);
                startActivity(intent);

                return false;
            }
        });
    }
}