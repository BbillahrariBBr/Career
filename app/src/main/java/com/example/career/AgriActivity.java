package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AgriActivity extends AppCompatActivity {
    Button agriadmission;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agri);
        agriadmission = (Button)findViewById(R.id.agriadmission);

        agriadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String agriadmissionmsg = "https://admission-agri.org/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("agriadmission_msg",agriadmissionmsg);
                startActivity(intent);
            }
        });
    }
}
