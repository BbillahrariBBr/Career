package com.example.career;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class PdfActivity extends AppCompatActivity {
    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        Intent intent = getIntent();
        String notice1msg = intent.getStringExtra("notice1msg");
        String notice2msg = intent.getStringExtra("notice2msg");
        String notice3msg = intent.getStringExtra("notice3msg");
        String notice4msg = intent.getStringExtra("notice4msg");
        String notice5msg = intent.getStringExtra("notice5msg");
        String notice6msg = intent.getStringExtra("notice6msg");
        String notice7msg = intent.getStringExtra("notice7msg");
        String notice8msg = intent.getStringExtra("notice8msg");
        String notice9msg = intent.getStringExtra("notice9msg");
        String notice10msg = intent.getStringExtra("notice10msg");
        String notice11msg = intent.getStringExtra("notice11msg");
        String notice12msg = intent.getStringExtra("notice12msg");

        browser = (WebView)findViewById(R.id.pdfview);
        //String url = "https://drive.google.com/file/d/1aA_whOpaaCihVT_6AHP3_44fzYbLfj6_/view";

        browser.getSettings().setJavaScriptEnabled(true);
        browser.getSettings().setBuiltInZoomControls(true);
        browser.getSettings().setDisplayZoomControls(true);
        browser.setWebChromeClient(new WebChromeClient());

        if(intent.getStringExtra("notice1msg") == notice1msg){
            browser.loadUrl(notice1msg);
        }
        if(intent.getStringExtra("notice2msg") == notice2msg){
            browser.loadUrl(notice2msg);
        }
        if(intent.getStringExtra("notice3msg") == notice3msg){
            browser.loadUrl(notice3msg);
        }
        if(intent.getStringExtra("notice4msg") == notice4msg){
            browser.loadUrl(notice4msg);
        }

        if(intent.getStringExtra("notice5msg") == notice5msg){
            browser.loadUrl(notice5msg);
        }
        if(intent.getStringExtra("notice6msg") == notice6msg){
            browser.loadUrl(notice6msg);
        }
        if(intent.getStringExtra("notice7msg") == notice7msg){
            browser.loadUrl(notice7msg);
        }
        if(intent.getStringExtra("notice8msg") == notice8msg){
            browser.loadUrl(notice8msg);
        }


        if(intent.getStringExtra("notice9msg") == notice9msg){
            browser.loadUrl(notice9msg);
        }
        if(intent.getStringExtra("notice10msg") == notice10msg){
            browser.loadUrl(notice10msg);
        }
        if(intent.getStringExtra("notice11msg") == notice11msg){
            browser.loadUrl(notice11msg);
        }
        if(intent.getStringExtra("notice12msg") == notice12msg){
            browser.loadUrl(notice12msg);
        }

    }
}
