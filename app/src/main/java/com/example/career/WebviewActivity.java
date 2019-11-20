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

        String buetadmissionmsg = intent.getStringExtra("buetadmission_msg");
        String buetvisitmsg = intent.getStringExtra("buetvisit_msg");
        String ruetadmissionmsg = intent.getStringExtra("ruetadmission_msg");
        String ruetvisitmsg = intent.getStringExtra("ruetvisit_msg");
        String kuetadmissionmsg = intent.getStringExtra("kuetadmission_msg");
        String kuetvisitmsg = intent.getStringExtra("kuetvisit_msg");
        String cuetadmissionmsg = intent.getStringExtra("cuetadmission_msg");
        String cuetvisitmsg = intent.getStringExtra("cuetvisit_msg");
        String duetadmissionmsg = intent.getStringExtra("duetadmission_msg");
        String duetvisitmsg = intent.getStringExtra("duetvisit_msg");

        String sustadmissionmsg = intent.getStringExtra("sustadmission_msg");
        String sustvisitmsg = intent.getStringExtra("sustvisit_msg");
        String pustadmissionmsg = intent.getStringExtra("pustadmission_msg");
        String pustvisitmsg = intent.getStringExtra("pustvisit_msg");
        String justadmissionmsg = intent.getStringExtra("justadmission_msg");
        String justvisitmsg = intent.getStringExtra("justvisit_msg");

        String nstuadmissionmsg = intent.getStringExtra("nstuadmission_msg");
        String nstuvisitmsg = intent.getStringExtra("nstuvisit_msg");

        String pstuadmissionmsg = intent.getStringExtra("pstuadmission_msg");
        String pstuvisitmsg = intent.getStringExtra("pstuvisit_msg");
        String mbstuadmissionmsg = intent.getStringExtra("mbstuadmission_msg");
        String mbstuvisitmsg = intent.getStringExtra("mbstuvisit_msg");
        String bsmrstuadmissionmsg = intent.getStringExtra("bsmrstuadmission_msg");
        String bsmrstuvisitmsg = intent.getStringExtra("bsmrstuvisit_msg");

        String agriadmissionmsg = intent.getStringExtra("agriadmission_msg");


        String nsuadmissionmsg = intent.getStringExtra("nsuadmission_msg");
        String nsuvisitmsg = intent.getStringExtra("nsuvisit_msg");
        String aiubadmissionmsg = intent.getStringExtra("aiubadmission_msg");
        String aiubvisitmsg = intent.getStringExtra("aiubvisit_msg");
        String austadmissionmsg = intent.getStringExtra("austadmission_msg");
        String austvisitmsg = intent.getStringExtra("austvisit_msg");
        String uiuadmissionmsg = intent.getStringExtra("uiuadmission_msg");
        String uiuvisitmsg = intent.getStringExtra("uiuvisit_msg");
        String bracadmissionmsg = intent.getStringExtra("bracadmission_msg");
        String bracvisitmsg = intent.getStringExtra("bracvisit_msg");
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

        if(intent.getStringExtra("buetadmission_msg") == buetadmissionmsg){
            webView.loadUrl(buetadmissionmsg);
        }
        if(intent.getStringExtra("buetvisit_msg") == buetvisitmsg){
            webView.loadUrl(buetvisitmsg);
        }
        if(intent.getStringExtra("ruetadmission_msg") == ruetadmissionmsg){
            webView.loadUrl(ruetadmissionmsg);
        }
        if(intent.getStringExtra("ruetvisit_msg") == ruetvisitmsg){
            webView.loadUrl(ruetvisitmsg);
        }
        if(intent.getStringExtra("kuetadmission_msg") == kuetadmissionmsg){
            webView.loadUrl(kuetadmissionmsg);
        }
        if(intent.getStringExtra("kuetvisit_msg") == kuetvisitmsg){
            webView.loadUrl(kuetvisitmsg);
        }
        if(intent.getStringExtra("cuetadmission_msg") == cuetadmissionmsg){
            webView.loadUrl(cuetadmissionmsg);
        }
        if(intent.getStringExtra("cuetvisit_msg") == cuetvisitmsg){
            webView.loadUrl(cuetvisitmsg);
        }
        if(intent.getStringExtra("duetadmission_msg") == duetadmissionmsg){
            webView.loadUrl(duetadmissionmsg);
        }
        if(intent.getStringExtra("duetvisit_msg") == duetvisitmsg){
            webView.loadUrl(duetvisitmsg);
        }

        if(intent.getStringExtra("sustadmission_msg") == sustadmissionmsg){
            webView.loadUrl(sustadmissionmsg);
        }
        if(intent.getStringExtra("sustvisit_msg") == sustvisitmsg){
            webView.loadUrl(sustvisitmsg);
        }

        if(intent.getStringExtra("pustadmission_msg") == pustadmissionmsg){
            webView.loadUrl(pustadmissionmsg);
        }
        if(intent.getStringExtra("pustvisit_msg") == pustvisitmsg){
            webView.loadUrl(pustvisitmsg);
        }

        if(intent.getStringExtra("justadmission_msg") == justadmissionmsg){
            webView.loadUrl(justadmissionmsg);
        }
        if(intent.getStringExtra("justvisit_msg") == justvisitmsg){
            webView.loadUrl(justvisitmsg);
        }

        if(intent.getStringExtra("nstuadmission_msg") == nstuadmissionmsg){
            webView.loadUrl(nstuadmissionmsg);
        }
        if(intent.getStringExtra("nstuvisit_msg") == nstuvisitmsg){
            webView.loadUrl(nstuvisitmsg);
        }

        if(intent.getStringExtra("pstuadmission_msg") == pstuadmissionmsg){
            webView.loadUrl(pstuadmissionmsg);
        }
        if(intent.getStringExtra("pstuvisit_msg") == pstuvisitmsg){
            webView.loadUrl(pstuvisitmsg);
        }

        if(intent.getStringExtra("mbstuadmission_msg") == mbstuadmissionmsg){
            webView.loadUrl(mbstuadmissionmsg);
        }
        if(intent.getStringExtra("mbstuvisit_msg") == mbstuvisitmsg){
            webView.loadUrl(mbstuvisitmsg);
        }

        if(intent.getStringExtra("bsmrstuadmission_msg") == bsmrstuadmissionmsg){
            webView.loadUrl(bsmrstuadmissionmsg);
        }
        if(intent.getStringExtra("bsmrstuvisit_msg") == bsmrstuvisitmsg){
            webView.loadUrl(bsmrstuvisitmsg);
        }
        if(intent.getStringExtra("agriadmission_msg") == agriadmissionmsg){
            webView.loadUrl(agriadmissionmsg);
        }


        if(intent.getStringExtra("nsuadmission_msg") == nsuadmissionmsg){
            webView.loadUrl(nsuadmissionmsg);
        }
        if(intent.getStringExtra("nsuvisit_msg") == nsuvisitmsg){
            webView.loadUrl(nsuvisitmsg);
        }
        if(intent.getStringExtra("aiubadmission_msg") == aiubadmissionmsg){
            webView.loadUrl(aiubadmissionmsg);
        }
        if(intent.getStringExtra("aiubvisit_msg") == aiubvisitmsg){
            webView.loadUrl(aiubvisitmsg);
        }
        if(intent.getStringExtra("austadmission_msg") == austadmissionmsg){
            webView.loadUrl(austadmissionmsg);
        }
        if(intent.getStringExtra("austvisit_msg") == austvisitmsg){
            webView.loadUrl(austvisitmsg);
        }
        if(intent.getStringExtra("uiuadmission_msg") == uiuadmissionmsg){
            webView.loadUrl(uiuadmissionmsg);
        }
        if(intent.getStringExtra("uiuvisit_msg") == uiuvisitmsg){
            webView.loadUrl(uiuvisitmsg);
        }
        if(intent.getStringExtra("bracadmission_msg") == bracadmissionmsg){
            webView.loadUrl(bracadmissionmsg);
        }
        if(intent.getStringExtra("bracvisit_msg") == bracvisitmsg){
            webView.loadUrl(bracvisitmsg);
        }
    }
}
