package com.patentify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {

    TextView welcm, quest1, quest2, finalText;
    private static int splashTimeout= 6000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        welcm= findViewById(R.id.welcomeText);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent= new Intent(Splash_Screen.this,LoginActivity.class);
                startActivity(splashIntent);
                finish();
            }
        }, splashTimeout);

        Animation myanimation= AnimationUtils.loadAnimation(Splash_Screen.this, R.anim.animation2);
        welcm.startAnimation(myanimation);




    }
}