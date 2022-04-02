package com.example.softwarecommunity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SubjectsActivity extends AppCompatActivity {

    // 로그에 사용할 TAG 변수
    final private String TAG = getClass().getSimpleName();

    // 사용할 컴포넌트 선언
    String userid = "";

    // 리스트뷰에 사용할 제목 배열
    ArrayList<String> titleList = new ArrayList<>();

    // 클릭했을 때 어떤 게시물을 클릭했는지 게시물 번호를 담기 위한 배열
    ArrayList<String> seqList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        //홈버튼
        Button homebtn = (Button) findViewById(R.id.homebtn);
        homebtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                return false;
            }
        });

        // 컴포넌트 초기화
        ListView listView = findViewById(R.id.listView);

        // listView 를 클릭했을 때 이벤트 추가
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                // 어떤 값을 선택했는지 토스트를 뿌려줌
                Toast.makeText(SubjectsActivity.this, adapterView.getItemAtPosition(i) + " 클릭", Toast.LENGTH_SHORT).show();

                // 게시판의 번호와 userid를 가지고 ListActivity 로 이동 ->특정 게시판 페이지
                Intent intent = new Intent(SubjectsActivity.this, ListActivity.class);
                intent.putExtra("board_seq", seqList.get(i));
                intent.putExtra("userid", userid);
                startActivity(intent);
            }
        });
    }
}