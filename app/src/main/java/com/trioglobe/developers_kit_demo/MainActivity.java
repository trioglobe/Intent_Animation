package com.trioglobe.developers_kit_demo;


import android.app.ActivityOptions;
import android.content.Intent;


import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {

    Button show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = findViewById(R.id.show);
       show.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
           Intent i = new Intent (MainActivity.this,activity.class);

               ActivityOptions options =
                       ActivityOptions.makeCustomAnimation(MainActivity.this, R.anim.fadein, R.anim.fadeout);
             startActivity(i, options.toBundle());

           }
       });
    }


}