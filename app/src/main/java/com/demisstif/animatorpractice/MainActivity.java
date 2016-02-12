package com.demisstif.animatorpractice;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        Toast.makeText(this,"imageview",Toast.LENGTH_SHORT).show();
    }
    public void move(View view){
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        ObjectAnimator a1 = ObjectAnimator.ofFloat(imageView,"translationX",0f,200f);
        ObjectAnimator a2 = ObjectAnimator.ofFloat(imageView,"translationY",0f,200f);
        ObjectAnimator a3 = ObjectAnimator.ofFloat(imageView,"rotation",0f,360f);
        AnimatorSet set = new AnimatorSet();
//        动画效果一起
//        set.playTogether(a1,a2,a3);

//        动画效果分开
//        set.play(a1).with(a2);
//        set.play(a3).after(a2);

        set.playSequentially(a1,a2,a3);


        set.setDuration(1000);
        set.start();

    }
}
