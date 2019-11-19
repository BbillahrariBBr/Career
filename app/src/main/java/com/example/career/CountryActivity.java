package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CountryActivity extends AppCompatActivity {
    ImageView pub, med;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);
        pub = (ImageView)findViewById(R.id.pub);
        med = (ImageView)findViewById(R.id.med);
        pub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             intent = new Intent(getApplicationContext(),PublicActivity.class);
             startActivity(intent);
            }
        });
        med.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),MedActivity.class);
                startActivity(intent);
            }
        });
    }
}
