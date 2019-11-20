package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EngActivity extends AppCompatActivity {
    Button buetadmission,buetvisit, ruetadmission,ruetvisit, cuetadmission,cuetvisit, kuetadmission,kuetvisit, duetadmission,duetvisit;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eng);
        buetadmission = (Button)findViewById(R.id.buetadmission);
        buetvisit = (Button)findViewById(R.id.buetvisit);
        ruetadmission = (Button)findViewById(R.id.ruetadmission);
        ruetvisit = (Button)findViewById(R.id.ruetvisit);
        cuetadmission = (Button)findViewById(R.id.cuetadmission);
        cuetvisit = (Button)findViewById(R.id.cuetvisit);
        kuetadmission = (Button)findViewById(R.id.kuetadmission);
        kuetvisit = (Button)findViewById(R.id.kuetvisit);
        duetadmission = (Button)findViewById(R.id.duetadmission);
        duetvisit = (Button)findViewById(R.id.duetvisit);

        buetadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buetadmissionmsg = "https://www.buet.ac.bd/web/Home/Admission";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("buetadmission_msg",buetadmissionmsg);
                startActivity(intent);
            }
        });
        buetvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buetvisitmsg = "https://www.buet.ac.bd/web/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("buetvisit_msg",buetvisitmsg);
                startActivity(intent);
            }
        });

        ruetadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ruetadmissionmsg = "http://www.ruet.ac.bd/admission/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("ruetadmission_msg",ruetadmissionmsg);
                startActivity(intent);
            }
        });
        ruetvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ruetvisitmsg = "http://www.ruet.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("ruetvisit_msg",ruetvisitmsg);
                startActivity(intent);
            }
        });

        kuetadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kuetadmissionmsg = "http://admission.kuet.ac.bd/adm/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("kuetadmission_msg",kuetadmissionmsg);
                startActivity(intent);
            }
        });
        kuetvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kuetvisitmsg = "http://www.kuet.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("kuetvisit_msg",kuetvisitmsg);
                startActivity(intent);
            }
        });

        cuetadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cuetadmissionmsg = "http://www.cuet.ac.bd/admission";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("cuetadmission_msg",cuetadmissionmsg);
                startActivity(intent);
            }
        });
        cuetvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cuetvisitmsg = "http://www.cuet.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("cuetvisit_msg",cuetvisitmsg);
                startActivity(intent);
            }
        });

        duetadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duetadmissionmsg = "http://www.duet.ac.bd/admission/undergraduate-admission/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("duetadmission_msg",duetadmissionmsg);
                startActivity(intent);
            }
        });
        duetvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duetvisitmsg = "http://www.duet.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("duetvisit_msg",duetvisitmsg);
                startActivity(intent);
            }
        });
    }
}
