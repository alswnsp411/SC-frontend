package com.example.softwarecommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    // 로그에 사용할 TAG
    final private String TAG = getClass().getSimpleName();

    // 사용할 컴포넌트 선언
    TextView title_tv, content_tv, date_tv;
    LinearLayout comment_layout;
    EditText comment_et;
    Button reg_button;

    // 선택한 게시물의 번호
    String board_seq = "";

    // 유저아이디 변수
    String userid = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // ListActivity 에서 넘긴 변수들을 받아줌
        board_seq = getIntent().getStringExtra("board_seq");
        userid = getIntent().getStringExtra("userid");

// 컴포넌트 초기화
        title_tv = findViewById(R.id.title_tv);
        content_tv = findViewById(R.id.content_tv);
        date_tv = findViewById(R.id.date_tv);

        comment_layout = findViewById(R.id.comment_layout);
        comment_et = findViewById(R.id.comment_et);
        reg_button = findViewById(R.id.reg_button);

// 등록하기 버튼을 눌렀을 때 댓글 등록 함수 호출
        reg_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //RegCmt regCmt = new RegCmt();
                //regCmt.execute(userid, comment_et.getText().toString(), board_seq);
            }
        });

// 해당 게시물의 데이터 불러오기
        //InitData();
    }
}