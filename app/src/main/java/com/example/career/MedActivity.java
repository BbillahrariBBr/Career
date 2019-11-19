package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MedActivity extends AppCompatActivity {
    Button bsmmuadmission,bsmmuvisit, rmuadmission,rmuvisit, cmuadmission,cmuvisit, ssmuadmission,ssmuvisit, smuadmission,smuvisit;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med);

        bsmmuadmission = (Button)findViewById(R.id.bsmmuadmission);
        bsmmuvisit = (Button)findViewById(R.id.bsmmuvisit);
        rmuadmission = (Button)findViewById(R.id.rmuadmission);
        rmuvisit = (Button)findViewById(R.id.rmuvisit);
        cmuadmission = (Button)findViewById(R.id.cmuadmission);
        cmuvisit = (Button)findViewById(R.id.cmuvisit);
        smuadmission = (Button)findViewById(R.id.smuadmission);
        smuvisit = (Button)findViewById(R.id.smuvisit);
        ssmuadmission = (Button)findViewById(R.id.ssmuadmission);
        ssmuvisit = (Button)findViewById(R.id.ssmuvisit);


        bsmmuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bsmmuadmissionmsg = "http://exam.bsmmu.edu.bd/bsmmu_nursing_2020/local/admission/index.php";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("bsmmuadmission_msg",bsmmuadmissionmsg);
                startActivity(intent);
            }
        });
        bsmmuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bsmmuvisitmsg = "https://bsmmu.edu.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("bsmmuvisit_msg",bsmmuvisitmsg);
                startActivity(intent);
            }
        });

        rmuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rmuadmissionmsg = "https://www.rmu.edu.bd/admission/undergraduate-admission/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("rmuuadmission_msg",rmuadmissionmsg);
                startActivity(intent);
            }
        });
        rmuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rmuvisitmsg = "https://www.rmu.edu.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("rmuvisit_msg",rmuvisitmsg);
                startActivity(intent);
            }
        });

        ssmuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ssmuadmissionmsg = "https://www.ssmcbd.net/undergratuade.php";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("ssmuadmission_msg",ssmuadmissionmsg);
                startActivity(intent);
            }
        });
        ssmuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ssmuvisitmsg = "https://www.ssmcbd.net/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("ssmuvisit_msg",ssmuvisitmsg);
                startActivity(intent);
            }
        });

        cmuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cmuadmissionmsg = "http://www.cmu.edu.bd/under-construction";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("cmuadmission_msg",cmuadmissionmsg);
                startActivity(intent);
            }
        });
        cmuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cmuvisitmsg = "http://www.cmu.edu.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("cmuvisit_msg",cmuvisitmsg);
                startActivity(intent);
            }
        });

        smuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smuadmissionmsg = "https://www.smu.edu.bd/under-construction";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("smuadmission_msg",smuadmissionmsg);
                startActivity(intent);
            }
        });
        smuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String smuvisitmsg = "https://www.smu.edu.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("smuvisit_msg",smuvisitmsg);
                startActivity(intent);
            }
        });
    }
}
