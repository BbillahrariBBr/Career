package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PriActivity extends AppCompatActivity {
    Button nsuadmission,nsuvisit, aiubadmission,aiubvisit, austadmission,austvisit, uiuadmission,uiuvisit, bracadmission,bracvisit;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pri);
        nsuadmission = (Button)findViewById(R.id.nsuadmission);
        nsuvisit = (Button)findViewById(R.id.nsuvisit);
        aiubadmission = (Button)findViewById(R.id.aiubadmission);
        aiubvisit = (Button)findViewById(R.id.aiubvisit);
        austadmission = (Button)findViewById(R.id.austadmission);
        austvisit = (Button)findViewById(R.id.austvisit);
        uiuadmission = (Button)findViewById(R.id.uiuadmission);
        uiuvisit = (Button)findViewById(R.id.uiuvisit);
        bracadmission = (Button)findViewById(R.id.bracadmission);
        bracvisit = (Button)findViewById(R.id.bracvisit);

        nsuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nsuadmissionmsg = "http://admissions.northsouth.edu/                                                        ";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("nsuadmission_msg",nsuadmissionmsg);
                startActivity(intent);
            }
        });
        nsuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nsuvisitmsg = "http://www.northsouth.edu/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("nsuvisit_msg",nsuvisitmsg);
                startActivity(intent);
            }
        });

        aiubadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aiubadmissionmsg = "http://www.aiub.edu/admission";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("aiubadmission_msg",aiubadmissionmsg);
                startActivity(intent);
            }
        });
        aiubvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String aiubvisitmsg = "http://www.aiub.edu/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("aiubvisit_msg",aiubvisitmsg);
                startActivity(intent);
            }
        });

        austadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String austadmissionmsg = "http://www.aust.edu/admission.htm";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("austadmission_msg",austadmissionmsg);
                startActivity(intent);
            }
        });
        austvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String austvisitmsg = "http://www.aust.edu/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("austvisit_msg",austvisitmsg);
                startActivity(intent);
            }
        });

        uiuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uiuadmissionmsg = "http://www.uiu.ac.bd/admission/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("uiuadmission_msg",uiuadmissionmsg);
                startActivity(intent);
            }
        });
        uiuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uiuvisitmsg = "http://www.uiu.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("uiuvisit_msg",uiuvisitmsg);
                startActivity(intent);
            }
        });

        bracadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bracadmissionmsg = "https://www.bracu.ac.bd/admissions";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("bracadmission_msg",bracadmissionmsg);
                startActivity(intent);
            }
        });
        bracvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bracvisitmsg = "https://www.bracu.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("bracvisit_msg",bracvisitmsg);
                startActivity(intent);
            }
        });
    }
}
