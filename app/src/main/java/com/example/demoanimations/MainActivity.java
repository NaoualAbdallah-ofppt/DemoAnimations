package com.example.demoanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

public class MainActivity extends AppCompatActivity
implements  View.OnClickListener
{
Button btn1,btn2,btn3,btn4;
ImageView img;
Animation Anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btnFade);
        btn1.setOnClickListener(this);
        btn2 = (Button)findViewById(R.id.btnScale);
        btn2.setOnClickListener(this);
        btn3 = (Button)findViewById(R.id.btnRotate);
        btn3.setOnClickListener(this);
        btn4 = (Button)findViewById(R.id.btnTranslate);
        btn4.setOnClickListener(this);
        img = (ImageView)findViewById(R.id.imgAnimation);

   }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFade:
                Anim=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                break;
            case R.id.btnScale:
                Anim=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scaleanim);
                break;
            case R.id.btnRotate:
                Anim=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotateanim);
                break;
            case R.id.btnTranslate:
                Anim=AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translateanim);
                break;
        }
        img.startAnimation(Anim);
        }

}
