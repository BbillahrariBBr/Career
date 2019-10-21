package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView mainimg;
    TextView text_welcome, text_desc;
    Button getstarted;
    Animation forimg, forbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainimg = (ImageView)findViewById(R.id.mainimg);
        text_welcome = (TextView)findViewById(R.id.text_welcome);
        text_desc = (TextView)findViewById(R.id.text_desc);
        getstarted = (Button)findViewById(R.id.getstarted);

        forimg = AnimationUtils.loadAnimation(this,R.anim.forimg);
        forbutton = AnimationUtils.loadAnimation(this, R.anim.forbutton);

        mainimg.startAnimation(forimg);
        text_welcome.startAnimation(forbutton);
        text_desc.startAnimation(forbutton);
        getstarted.startAnimation(forbutton);

        getstarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
