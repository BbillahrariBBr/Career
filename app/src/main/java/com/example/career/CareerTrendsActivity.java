package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class CareerTrendsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career_trends);
        TextView crtr10 = (TextView)findViewById(R.id.crtr10);
        crtr10.setMovementMethod(LinkMovementMethod.getInstance());

        TextView crtr9 = (TextView)findViewById(R.id.crtr9);
        crtr9.setMovementMethod(LinkMovementMethod.getInstance());

        TextView crtr8 = (TextView)findViewById(R.id.crtr8);
        crtr8.setMovementMethod(LinkMovementMethod.getInstance());

        TextView crtr7 = (TextView)findViewById(R.id.crtr7);
        crtr7.setMovementMethod(LinkMovementMethod.getInstance());

        TextView crtr6 = (TextView)findViewById(R.id.crtr6);
        crtr6.setMovementMethod(LinkMovementMethod.getInstance());

        TextView crtr5 = (TextView)findViewById(R.id.crtr5);
        crtr5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView crtr4 = (TextView)findViewById(R.id.crtr4);
        crtr4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView crtr3 = (TextView)findViewById(R.id.crtr3);
        crtr3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView crtr2 = (TextView)findViewById(R.id.crtr2);
        crtr2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView crtr1 = (TextView)findViewById(R.id.crtr1);
        crtr1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
