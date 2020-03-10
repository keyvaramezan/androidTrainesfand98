package com.android.train.esfand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class HandlerActivity extends AppCompatActivity {
    boolean isBackPressed = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
    }

    @Override
    public void onBackPressed() {
        if (isBackPressed == true){
            super.onBackPressed();
        }else{
            isBackPressed = true;
            Toast.makeText(HandlerActivity.this,"fo exit tap back again",Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    isBackPressed = false;
                }
            }, 2000);
        }

    }
}
