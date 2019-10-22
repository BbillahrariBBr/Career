package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SubReviewActivity extends AppCompatActivity {
    ImageView cse, eee, bba,law, english, economic;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_review);
        cse = (ImageView)findViewById(R.id.cse);
        eee = (ImageView)findViewById(R.id.eee);
        bba = (ImageView)findViewById(R.id.bba);
        law = (ImageView)findViewById(R.id.law);
        english = (ImageView)findViewById(R.id.english);
        economic = (ImageView)findViewById(R.id.economic);


        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String csemsg = "https://www.youtube.com/watch?v=ncPe2-asSBs&list=PLjtNxM_ukD14afMwFtrlAeNPneSrcLDyp&index=2";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("cse_msg",csemsg);
                startActivity(intent);
            }
        });

        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eeemsg = "https://www.youtube.com/watch?v=5ChqWiuLrZ0&list=PLjtNxM_ukD14afMwFtrlAeNPneSrcLDyp&index=5";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("eee_msg",eeemsg);
                startActivity(intent);

            }
        });

        bba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bbamsg = "https://www.youtube.com/watch?v=T5k8cofiTXA&list=PLjtNxM_ukD14afMwFtrlAeNPneSrcLDyp&index=8";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("bba_msg",bbamsg);
                startActivity(intent);
            }
        });

        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lawmsg = "https://www.youtube.com/watch?v=g_Njj6U1LC8&list=PLjtNxM_ukD14afMwFtrlAeNPneSrcLDyp&index=12";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("law_msg",lawmsg);
                startActivity(intent);

            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String englishmsg = "https://www.youtube.com/watch?v=I3rMKeM7nhE&list=PLjtNxM_ukD14afMwFtrlAeNPneSrcLDyp&index=11";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("english_msg",englishmsg);
                startActivity(intent);
            }
        });

        economic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String economicmsg = "https://www.youtube.com/watch?v=5x6Dv2NYBvo&list=PLjtNxM_ukD14afMwFtrlAeNPneSrcLDyp&index=10";
                intent = new Intent(getApplicationContext(),YoutubeActivity.class);
                intent.putExtra("economic_msg",economicmsg);
                startActivity(intent);

            }
        });
    }
}
