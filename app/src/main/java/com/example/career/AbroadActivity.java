package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AbroadActivity extends AppCompatActivity {
    Button ucl, harvard,stanford, oxford, cambridge, hongkong, toronto;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abroad);
        ucl = (Button)findViewById(R.id.ucl);
        harvard = (Button)findViewById(R.id.harvard);
        stanford = (Button)findViewById(R.id.stanford);
        oxford = (Button)findViewById(R.id.oxford);
        cambridge = (Button)findViewById(R.id.cambridge);
        hongkong = (Button)findViewById(R.id.hongkong);
        toronto = (Button)findViewById(R.id.toronto);

        ucl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uclmsg = "https://www.ucl.ac.uk";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("ucl_msg",uclmsg);
                startActivity(intent);
            }
        });

        toronto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String torontomsg = "https://www.utoronto.ca";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("toronto_msg",torontomsg);
                startActivity(intent);
            }
        });

        harvard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String harvardmsg = "https://www.harvard.edu";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("harvard_msg",harvardmsg);
                startActivity(intent);
            }
        });

        stanford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stanfordmsg = "https://www.stanford.edu";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("stanford_msg",stanfordmsg);
                startActivity(intent);
            }
        });


        oxford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oxfordmsg = "https://www.ox.ac.uk/";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("oxford_msg",oxfordmsg);
                startActivity(intent);
            }
        });

        cambridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cambridgemsg = "https://www.cam.ac.uk";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("cambridge_msg",cambridgemsg);
                startActivity(intent);
            }
        });


        hongkong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hongkongmsg = "https://www.hku.hk";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("hongkong_msg",hongkongmsg);
                startActivity(intent);
            }
        });
    }
}
