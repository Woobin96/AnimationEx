package com.wooeun18.animationex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //모든 뷰에게는 애니메이션 효과를 줄 수 있음 .
        //애니메이션의 종류 - 4가지
        //1. 이동 애니메이션          : translate
        //2. 사이즈 조절 애니메이션    : scale
        //3. 회전 애니메이션          : rotate
        //4. 투명도 조절 애니메이션    : alpha

        iv= findViewById(R.id.iv);

        //애니메이션 객체 생성.
        //애니메이션 설정을 xml 로  설계하고 자바에서 애니메이션 객체로 만들어 사용 .

        Animation ani= AnimationUtils.loadAnimation(this,R.anim.appear_logo);
        iv.startAnimation(ani);
    }

    public void clickBtn(View view) {
        Animation ani= AnimationUtils.loadAnimation(this,R.anim.appear_logo);
        iv.startAnimation(ani);
    }
}