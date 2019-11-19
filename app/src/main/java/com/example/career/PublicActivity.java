package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class PublicActivity extends AppCompatActivity {
    Button buadmission,buvisit, ruadmission,ruvisit, duadmission,duvisit, juadmission,juvisit, jnuadmission,jnuvisit, cuadmission,cuvisit, kuadmission,kuvisit;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public);
        buadmission = (Button)findViewById(R.id.buadmission);
        buvisit = (Button)findViewById(R.id.buvisit);

        ruadmission = (Button)findViewById(R.id.ruadmission);
        ruvisit = (Button)findViewById(R.id.ruvisit);

        duadmission = (Button)findViewById(R.id.duadmission);
        duvisit = (Button)findViewById(R.id.duvisit);

        juadmission = (Button)findViewById(R.id.juadmission);
        juvisit = (Button)findViewById(R.id.juvisit);

        jnuadmission = (Button)findViewById(R.id.jnuadmission);
        jnuvisit = (Button)findViewById(R.id.jnuvisit);

        cuadmission = (Button)findViewById(R.id.cuadmission);
        cuvisit = (Button)findViewById(R.id.cuvisit);

        kuadmission = (Button)findViewById(R.id.kuadmission);
        kuvisit = (Button)findViewById(R.id.kuvisit);


        buadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buadmissionmsg = "http://bu.ac.bd/?ref=undergraduate";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("buadmission_msg",buadmissionmsg);
                startActivity(intent);
            }
        });
        buvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String buvisitmsg = "http://www.barisaluniv.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("buvisit_msg",buvisitmsg);
                startActivity(intent);
            }
        });

        ruadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ruadmissionmsg = "http://admission.ru.ac.bd/undergraduate/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("ruadmission_msg",ruadmissionmsg);
                startActivity(intent);
            }
        });
        ruvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ruvisitmsg = "http://www.ru.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("ruvisit_msg",ruvisitmsg);
                startActivity(intent);
            }
        });

        duadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duadmissionmsg = "https://admission.eis.du.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("duadmission_msg",duadmissionmsg);
                startActivity(intent);
            }
        });
        duvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String duvisitmsg = "http://www.du.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("duvisit_msg",duvisitmsg);
                startActivity(intent);
            }
        });

        juadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String juadmissionmsg = "https://ju-admission.org/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("juadmission_msg",juadmissionmsg);
                startActivity(intent);
            }
        });
        juvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String juvisitmsg = "http://www.juniv.edu/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("juvisit_msg",juvisitmsg);
                startActivity(intent);
            }
        });

        jnuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jnuadmissionmsg = "http://admissionjnu.info/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("jnuadmission_msg",jnuadmissionmsg);
                startActivity(intent);
            }
        });
        jnuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jnuvisitmsg = "https://www.jnu.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("jnuvisit_msg",jnuvisitmsg);
                startActivity(intent);
            }
        });

        cuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cuadmissionmsg = "https://admission.cu.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("cuadmission_msg",cuadmissionmsg);
                startActivity(intent);
            }
        });
        cuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cuvisitmsg = "http://cu.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("cuvisit_msg",cuvisitmsg);
                startActivity(intent);
            }
        });

        kuadmission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kuadmissionmsg = "http://www.ku.ac.bd/undergraduate";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("kuadmission_msg",kuadmissionmsg);
                startActivity(intent);
            }
        });
        kuvisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kuvisitmsg = "http://www.ku.ac.bd/";
                intent = new Intent(getApplicationContext(), WebviewActivity.class);
                intent.putExtra("kuvisit_msg",kuvisitmsg);
                startActivity(intent);
            }
        });
    }
}
