package com.siddik.siddiksummer2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationActivity extends BaseActivity {

    @BindView(R.id.activity_animation_tv)
    TextView textView;
    private Animation alphaAnimation;
    private Animation scaleAnimation;
    private Animation rotateAnimation;
    private Animation transAnimation;
    private Animation setAnimation;

    @OnClick(R.id.activity_animation_alpha)
    public void alphs(View v){
        textView.startAnimation(alphaAnimation);
    }
    @OnClick(R.id.activity_animation_scale)
    public void scale(View v){
        textView.startAnimation(scaleAnimation);
    }
    @OnClick(R.id.activity_animation_rotate)
    public void rotate(View v){
        textView.startAnimation(rotateAnimation);
    }
    @OnClick(R.id.activity_animation_trans)
    public void trans(View v){
        textView.startAnimation(transAnimation);
    }
    @OnClick(R.id.activity_animation_set)
    public void set(View v){
        textView.startAnimation(setAnimation);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
        initialAnimation();
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shortToast("You clicked Text view");
            }
        });
    }

    private void initialAnimation(){
        alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
        rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_rotate);
        transAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_trans);
        setAnimation = AnimationUtils.loadAnimation(this, R.anim.anim_set);
    }
}
