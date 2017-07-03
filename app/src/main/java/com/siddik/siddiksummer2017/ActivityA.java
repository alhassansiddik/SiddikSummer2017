package com.siddik.siddiksummer2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.siddik.siddiksummer2017.audio.BaseBean;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ActivityA extends BaseActivity {

    @OnClick(R.id.activity_a_a)
    public void toA(View view){
        goToActivity(ActivityA.class);
    }

    @OnClick(R.id.activity_a_b)
    public void toB(View view){
        goToActivity(ActivityB.class);
    }

    @OnClick(R.id.activity_a_c)
    public void toC(View view){
        goToActivity(ActivityC.class);
    }

    @OnClick(R.id.activity_a_d)
    public void toD(View view){
        goToActivity(ActivityD.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);
        //showToast("onCreate");
//        Intent intent = getIntent();
//        Bundle bundle = intent.getBundleExtra("Bundle");
//        String bs = bundle.getString("StringBundle");
//        int b1 = bundle.getInt("IntegerBundle", 0);
//        BaseBean bean = (BaseBean) bundle.getSerializable("bean");
//        shortToast(bean.getName());

//        shortToast(bs);
//        shortToast("Integer is:" +bs);
//        String s = intent.getStringExtra("StringInfo");
//        int i = intent.getIntExtra("IntegerInfo", 0);
//        shortToast(s);
//        shortToast(String.valueOf(i));
//        shortToast("Integer is:" + i);

    }

    @Override
    protected void onNewIntent(Intent intent){
        super.onNewIntent(intent);
        showToast("onNewIntent");
    }
}
