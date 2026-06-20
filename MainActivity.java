package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends BaseActivity {
    ImageView img_logo;
    Animation fadeInAnim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_logo=findViewById(R.id.img_main_logo);


        img_logo.setAnimation(fadeInAnim);
        fadeInAnim= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade);
        img_logo.setAnimation(fadeInAnim);


        Handler h=new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}

