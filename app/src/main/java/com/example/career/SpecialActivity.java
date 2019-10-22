package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SpecialActivity extends AppCompatActivity {
    ImageView sub_review, cal,video, trends,tips, transport ;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special);
        sub_review = (ImageView) findViewById(R.id.sub_review);
        cal = (ImageView) findViewById(R.id.calender);
        video = (ImageView) findViewById(R.id.video);
        trends = (ImageView) findViewById(R.id.trends);
        tips = (ImageView) findViewById(R.id.tips);
        transport = (ImageView) findViewById(R.id.transport);

        sub_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SubReviewActivity.class);
                startActivity(intent);
                //working
            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),NoticeActivity.class);
                startActivity(intent);
                //working
            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String careervdomsg = "https://www.youtube.com/results?search_query=career+video";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("careervdo_msg",careervdomsg);
                startActivity(intent);
            }
        });

        trends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               intent = new Intent(getApplicationContext(),CareerTrendsActivity.class);
                startActivity(intent);
                //working
            }
        });

        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tipsmsg = "https://inomics.com/search?insight=insight-ranking,insight-study-abroad,insight-study-advice,insight-work-abroad";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("tips_msg",tipsmsg);
                startActivity(intent);
                //working
            }
        });

        transport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String transportmsg = "https://www.shohoz.com/bus-tickets";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("transport_msg",transportmsg);
                startActivity(intent);
                //working
            }
        });
    }
}
