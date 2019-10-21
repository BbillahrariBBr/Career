package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button buttonAbroad, buttonHome,buttonNotice,buttonSpecial;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        buttonAbroad = (Button)findViewById(R.id.buttonAbroad);
        buttonHome = (Button)findViewById(R.id.buttonHome);
        buttonNotice = (Button)findViewById(R.id.buttonNotice);
        buttonSpecial = (Button)findViewById(R.id.buttonSpecial);

        buttonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),CountryActivity.class);
                startActivity(intent);
            }
        });

        buttonAbroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),AbroadActivity.class);
                startActivity(intent);
            }
        });

        buttonSpecial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),SpecialActivity.class);
                startActivity(intent);
            }
        });

        buttonNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),NoticeActivity.class);
                startActivity(intent);
            }
        });
    }
}
