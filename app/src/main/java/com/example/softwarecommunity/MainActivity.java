package com.example.softwarecommunity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //로그인 버튼 클릭
        Button loginpagebtn= (Button) findViewById(R.id.loginpagebtn);
        loginpagebtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent(getApplicationContext(),LoginActivity.class);
                        startActivity(intent);
                    }
                }
        );

        //회원가입 버튼 클릭
        Button joinpagebtn= (Button) findViewById(R.id.joinpagebtn);
        joinpagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), JoinActivity.class);
                startActivity(intent);
            }
        });
    }
}