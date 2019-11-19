package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        Intent intent = getIntent();

        String buadmissionmsg = intent.getStringExtra("buadmission_msg");
        String buvisitmsg = intent.getStringExtra("buvisit_msg");

        String ruadmissionmsg = intent.getStringExtra("ruadmission_msg");
        String ruvisitmsg = intent.getStringExtra("ruvisit_msg");

        String duadmissionmsg = intent.getStringExtra("duadmission_msg");
        String duvisitmsg = intent.getStringExtra("duvisit_msg");

        String juadmissionmsg = intent.getStringExtra("juadmission_msg");
        String juvisitmsg = intent.getStringExtra("juvisit_msg");

        String jnuadmissionmsg = intent.getStringExtra("jnuadmission_msg");
        String jnuvisitmsg = intent.getStringExtra("jnuvisit_msg");

        String cuadmissionmsg = intent.getStringExtra("cuadmission_msg");
        String cuvisitmsg = intent.getStringExtra("cuvisit_msg");

        String kuadmissionmsg = intent.getStringExtra("kuadmission_msg");
        String kuvisitmsg = intent.getStringExtra("kuvisit_msg");

        String bsmmuadmissionmsg = intent.getStringExtra("bsmmuadmission_msg");
        String bsmmuvisitmsg = intent.getStringExtra("bsmmuvisit_msg");
        String rmuadmissionmsg = intent.getStringExtra("rmuadmission_msg");
        String rmuvisitmsg = intent.getStringExtra("rmuvisit_msg");
        String ssmuadmissionmsg = intent.getStringExtra("ssmuadmission_msg");
        String ssmuvisitmsg = intent.getStringExtra("ssmuvisit_msg");
        String cmuadmissionmsg = intent.getStringExtra("cmuadmission_msg");
        String cmuvisitmsg = intent.getStringExtra("cmuvisit_msg");
        String smuadmissionmsg = intent.getStringExtra("smuadmission_msg");
        String smuvisitmsg = intent.getStringExtra("smuvisit_msg");
        WebView webView = (WebView)findViewById(R.id.webview);

        if(intent.getStringExtra("buadmission_msg") == buadmissionmsg){
            webView.loadUrl(buadmissionmsg);
        }
        if(intent.getStringExtra("buvisit_msg") == buvisitmsg){
            webView.loadUrl(buvisitmsg);
        }

        if(intent.getStringExtra("ruadmission_msg") == ruadmissionmsg){
            webView.loadUrl(ruadmissionmsg);
        }
        if(intent.getStringExtra("ruvisit_msg") == ruvisitmsg){
            webView.loadUrl(ruvisitmsg);
        }


        if(intent.getStringExtra("duadmission_msg") == duadmissionmsg){
            webView.loadUrl(duadmissionmsg);
        }
        if(intent.getStringExtra("duvisit_msg") == duvisitmsg){
            webView.loadUrl(duvisitmsg);
        }


        if(intent.getStringExtra("juadmission_msg") == juadmissionmsg){
            webView.loadUrl(juadmissionmsg);
        }
        if(intent.getStringExtra("juvisit_msg") ==juvisitmsg){
            webView.loadUrl(juvisitmsg);
        }

        if(intent.getStringExtra("jnuadmission_msg") == jnuadmissionmsg){
            webView.loadUrl(jnuadmissionmsg);
        }
        if(intent.getStringExtra("jnuvisit_msg") == jnuvisitmsg){
            webView.loadUrl(jnuvisitmsg);
        }

        if(intent.getStringExtra("cuadmission_msg") == cuadmissionmsg){
            webView.loadUrl(cuadmissionmsg);
        }
        if(intent.getStringExtra("cuvisit_msg") == cuvisitmsg){
            webView.loadUrl(cuvisitmsg);
        }

        if(intent.getStringExtra("kuadmission_msg") == kuadmissionmsg){
            webView.loadUrl(kuadmissionmsg);
        }
        if(intent.getStringExtra("kuvisit_msg") == kuvisitmsg){
            webView.loadUrl(kuvisitmsg);
        }

        if(intent.getStringExtra("bsmmuadmission_msg") == bsmmuadmissionmsg){
            webView.loadUrl(bsmmuadmissionmsg);
        }
        if(intent.getStringExtra("bsmmuvisit_msg") == bsmmuvisitmsg){
            webView.loadUrl(bsmmuvisitmsg);
        }

        if(intent.getStringExtra("rmuadmission_msg") == rmuadmissionmsg){
            webView.loadUrl(rmuadmissionmsg);
        }
        if(intent.getStringExtra("rmuvisit_msg") == rmuvisitmsg){
            webView.loadUrl(rmuvisitmsg);
        }

        if(intent.getStringExtra("ssmuadmission_msg") == ssmuadmissionmsg){
            webView.loadUrl(ssmuadmissionmsg);
        }
        if(intent.getStringExtra("ssmuvisit_msg") == ssmuvisitmsg){
            webView.loadUrl(ssmuvisitmsg);
        }

        if(intent.getStringExtra("cmuadmission_msg") == cmuadmissionmsg){
            webView.loadUrl(cmuadmissionmsg);
        }
        if(intent.getStringExtra("cmuvisit_msg") == cmuvisitmsg){
            webView.loadUrl(cmuvisitmsg);
        }

        if(intent.getStringExtra("smuadmission_msg") == smuadmissionmsg){
            webView.loadUrl(smuadmissionmsg);
        }
        if(intent.getStringExtra("smuvisit_msg") == smuvisitmsg){
            webView.loadUrl(smuvisitmsg);
        }
    }
}
