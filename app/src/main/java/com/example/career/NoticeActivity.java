package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoticeActivity extends AppCompatActivity {
    Button notice1, notice2, notice3, notice4, notice5,notice6, notice7, notice8, notice9, notice10, notice11, notice12;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        notice1 = (Button)findViewById(R.id.notice1);
        notice2 = (Button)findViewById(R.id.notice2);
        notice3 = (Button)findViewById(R.id.notice3);
        notice4 = (Button)findViewById(R.id.notice4);
        notice5 = (Button)findViewById(R.id.notice5);
        notice6 = (Button)findViewById(R.id.notice6);
        notice7 = (Button)findViewById(R.id.notice7);
        notice8 = (Button)findViewById(R.id.notice8);
        notice9 = (Button)findViewById(R.id.notice9);
        notice10 = (Button)findViewById(R.id.notice10);
        notice11 = (Button)findViewById(R.id.notice11);
        notice12 = (Button)findViewById(R.id.notice12);

        notice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice1msg = "https://drive.google.com/file/d/1aA_whOpaaCihVT_6AHP3_44fzYbLfj6_/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice1msg",notice1msg);
                startActivity(intent);
            }
        });

        notice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice2msg = "https://drive.google.com/file/d/1xyex1_i9uIC57dS8pq7Xq4fH6BOy4X_G/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice2msg",notice2msg);
                startActivity(intent);
            }
        });

        notice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice3msg = "https://drive.google.com/file/d/11XBaStyTCr724pHkBKTBGMOVvh8rHkvJ/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice3msg",notice3msg);
                startActivity(intent);
            }
        });

        notice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice4msg = "https://drive.google.com/file/d/1sUArOnnCn_GAzydt5gOEX64ocWKHpfDM/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice4msg",notice4msg);
                startActivity(intent);
            }
        });


        notice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice5msg = "https://drive.google.com/file/d/1OOqngRx-4FFPmvKZe9cvoTEwU6taSKbT/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice5msg",notice5msg);
                startActivity(intent);
            }
        });

        notice6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice6msg = "https://drive.google.com/file/d/13C0qaF4tWNIzKSbf3uAr-ho8jcRL7y-e/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice6msg",notice6msg);
                startActivity(intent);
            }
        });

        notice7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice7msg = "https://drive.google.com/file/d/1eoWcVCMEzpCbG8DYB8hk4ECgyQkuIqDK/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice7msg",notice7msg);
                startActivity(intent);
            }
        });

        notice8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice8msg = "https://drive.google.com/file/d/1_lBztTXzU0f_Rann3cuf3cUmh8_6nHoT/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice8msg",notice8msg);
                startActivity(intent);
            }
        });

        notice9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice9msg = "https://drive.google.com/file/d/1WCI40BlS11SYItWAL6f8rQZiNsyw69cC/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice9msg",notice9msg);
                startActivity(intent);
            }
        });

        notice10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice10msg = "https://drive.google.com/file/d/1m3PC3qVTn12_tyQHQzlaTEKnfVkpeFOw/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice10msg",notice10msg);
                startActivity(intent);
            }
        });

        notice11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice11msg = "https://drive.google.com/file/d/1W7dWnht-cq0f3EBdsT_JZYiIfw85SSfT/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice11msg",notice11msg);
                startActivity(intent);
            }
        });

        notice12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String notice12msg = "https://drive.google.com/file/d/1D4Bmj4kQ2tB53Al-rh2ZPt-BjckvDF3z/view";
                intent = new Intent(getApplicationContext(),PdfActivity.class);
                intent.putExtra("notice12msg",notice12msg);
                startActivity(intent);
            }
        });
    }
}
