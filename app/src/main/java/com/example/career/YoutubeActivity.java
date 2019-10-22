package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

public class YoutubeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);
        Intent intent = getIntent();
        String csemsg = intent.getStringExtra("cse_msg");
        String eeemsg = intent.getStringExtra("eee_msg");
        String bbamsg = intent.getStringExtra("bba_msg");
        String lawmsg = intent.getStringExtra("law_msg");
        String englishmsg = intent.getStringExtra("english_msg");
        String economicmsg = intent.getStringExtra("economic_msg");
        String careervdomsg = intent.getStringExtra("careervdo_msg");
        String tipsmsg = intent.getStringExtra("tips_msg");
        String transportmsg = intent.getStringExtra("transport_msg");



        WebView webView = (WebView)findViewById(R.id.subreviewwebview);
        if(intent.getStringExtra("cse_msg") == csemsg){
            webView.loadUrl(csemsg);
        }
        if(intent.getStringExtra("eee_msg") == eeemsg){
            webView.loadUrl(eeemsg);
        }
        if(intent.getStringExtra("bba_msg") == bbamsg){
            webView.loadUrl(bbamsg);
        }
        if(intent.getStringExtra("law_msg") == lawmsg){
            webView.loadUrl(lawmsg);
        }
        if(intent.getStringExtra("english_msg") == englishmsg){
            webView.loadUrl(englishmsg);
        }
        if(intent.getStringExtra("economic_msg") == economicmsg){
            webView.loadUrl(economicmsg);
        }
        if(intent.getStringExtra("careervdo_msg") == careervdomsg){
            webView.loadUrl(careervdomsg);
        }
        if(intent.getStringExtra("tips_msg") == tipsmsg){
            webView.loadUrl(tipsmsg);
        }
        if(intent.getStringExtra("transport_msg") == transportmsg){
            webView.loadUrl(transportmsg);
        }
    }
}
