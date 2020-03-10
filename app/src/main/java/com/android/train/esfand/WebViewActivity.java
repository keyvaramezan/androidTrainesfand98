package com.android.train.esfand;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView wvbTest = findViewById(R.id.wbvTest);
        wvbTest.getSettings().setJavaScriptEnabled(true);
        wvbTest.setWebViewClient(new CustomWebViewClient());
        wvbTest.loadUrl("https://farsnews.com");
    }
    class CustomWebViewClient extends  WebViewClient
    {
        ProgressDialog dialog ;
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
             dialog = ProgressDialog.show(WebViewActivity.this, "Waiting",
                    "Loading. Please wait...", true);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            dialog.cancel();
        }
    }
}
