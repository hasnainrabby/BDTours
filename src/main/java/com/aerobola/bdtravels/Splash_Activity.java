package com.aerobola.bdtravels;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                splash2();
            }
        }, 2000);
    }


    public void splash2(){
        setContentView(R.layout.splash_screen_2);

        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(Splash_Activity.this, FirstPage.class);
                startActivity(intent);
                finish();

            }
        },5000);

    }
}
