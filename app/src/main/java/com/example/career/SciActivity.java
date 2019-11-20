package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SciActivity extends AppCompatActivity {
    Button sustadmission,sustvisit, pustadmission,pustvisit, justadmission,justvisit, nstuadmission,nstuvisit,pstuadmission,pstuvisit,mbstuadmission,mbstuvisit,bsmrstuadmission,bsmrstuvisit;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci);
        sustadmission = (Button)findViewById(R.id.sustadmission);
        sustvisit = (Button)findViewById(R.id.sustvisit);

        pustadmission = (Button)findViewById(R.id.pustadmission);
        pustvisit = (Button)findViewById(R.id.pustvisit);

        justadmission = (Button)findViewById(R.id.justadmission);
        justvisit = (Button)findViewById(R.id.justvisit);

        nstuadmission = (Button)findViewById(R.id.nstuadmission);
        nstuvisit = (Button)findViewById(R.id.nstuvisit);

        pstuadmission = (Button)findViewById(R.id.pstuadmission);
        pstuvisit = (Button)findViewById(R.id.pstuvisit);

        mbstuadmission = (Button)findViewById(R.id.mbstuadmission);
        mbstuvisit = (Button)findViewById(R.id.mbstuvisit);

        bsmrstuadmission = (Button)findViewById(R.id.bsmrstuadmission);
        bsmrstuvisit = (Button)findViewById(R.id.bsmrstuvisit);

        sustadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sustadmissionmsg = "https://admission.sust.edu/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("sustadmission_msg",sustadmissionmsg);
                startActivity(intent);
            }
        });
        sustvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sustvisitmsg = "https://www.sust.edu/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("sustvisit_msg",sustvisitmsg);
                startActivity(intent);
            }
        });

        pustadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pustadmissionmsg = "http://www.pust.ac.bd/admission/undergraduate";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("pustadmission_msg",pustadmissionmsg);
                startActivity(intent);
            }
        });
        pustvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pustvisitmsg = "http://www.pust.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("pustvisit_msg",pustvisitmsg);
                startActivity(intent);
            }
        });

        justadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String justadmissionmsg = "https://admission.just.edu.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("justadmission_msg",justadmissionmsg);
                startActivity(intent);
            }
        });
        justvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String justvisitmsg = "https://just.edu.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("justvisit_msg",justvisitmsg);
                startActivity(intent);
            }
        });

        nstuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nstuadmissionmsg = "https://nstu.admission.online/%e0%a6%b9%e0%a7%8b%e0%a6%ae-%e0%a6%aa%e0%a7%87%e0%a6%9c-2";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("nstuadmission_msg",nstuadmissionmsg);
                startActivity(intent);
            }
        });
        nstuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nstuvisitmsg = "http://www.nstu.edu.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("nstuvisit_msg",nstuvisitmsg);
                startActivity(intent);
            }
        });

        pstuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pstuadmissionmsg = "http://www.pstu.ac.bd/admission/undergraduate";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("pstuadmission_msg",pstuadmissionmsg);
                startActivity(intent);
            }
        });
        pstuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pstuvisitmsg = "http://www.pstu.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("pstuvisit_msg",pstuvisitmsg);
                startActivity(intent);
            }
        });

        mbstuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mbstuadmissionmsg = "https://mbstu.ac.bd/admission.html";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("mbstuadmission_msg",mbstuadmissionmsg);
                startActivity(intent);
            }
        });
        mbstuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mbstuvisitmsg = "https://www.mbstu.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("mbstuvisit_msg",mbstuvisitmsg);
                startActivity(intent);
            }
        });

        bsmrstuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bsmrstuadmissionmsg = "https://www.admission.bsmrstu.edu.bd/b/admission/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("bsmrstuadmission_msg",bsmrstuadmissionmsg);
                startActivity(intent);
            }
        });
        bsmrstuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bsmrstuvisitmsg = "https://www.bsmrstu.edu.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("bsmrstuvisit_msg",bsmrstuvisitmsg);
                startActivity(intent);
            }
        });
    }
}
