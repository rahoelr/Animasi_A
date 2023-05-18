package com.example.animasia;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ObjectAnimator mAnimator;
    ObjectAnimator mAnimator2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.img);
        Button btn = findViewById(R.id.btnStart);

        mAnimator = ObjectAnimator.ofFloat(imageView, "y", 300);
        mAnimator2 = ObjectAnimator.ofFloat(imageView, "rotation", 720);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAnimator.setDuration(1000);
                mAnimator2.setDuration(1000);
                mAnimator.start();
                mAnimator2.start();

            }
        });


    }
}