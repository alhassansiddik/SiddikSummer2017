package com.siddik.siddiksummer2017;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.siddik.siddiksummer2017.fragment.DemoFragment;
import com.siddik.siddiksummer2017.fragment.WorkFragment;

public class MainActivity extends AppCompatActivity {

    private TextView tv_demo;
    private TextView tv_work;
    private Button tv_submit;
    private TextView tv_subshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialView();
        setListener();
    }

    private void initialView() {
        tv_demo = (TextView) findViewById(R.id.activity_tool_demo);
        tv_work = (TextView) findViewById(R.id.activity_tool_work);
//        tv_submit = (Button) findViewById(R.id.activity_tool_submit);
//        tv_subshow = (TextView) findViewById(R.id.activity_tool_subshow);

    }

    private void setListener() {
        final WorkFragment workFragment = new WorkFragment();
        final DemoFragment demoFragment = new DemoFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,
                demoFragment).commit();
        tv_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_work.setTextColor(Color.BLACK);
                tv_demo.setTextColor(Color.RED);
                getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,
                        demoFragment).commit();
            }
        });

//        tv_submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tv_subshow.setText("You can do it!");
//                getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,
//                        workFragment).commit();
//            }
//        });

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_work.setTextColor(Color.RED);
                tv_demo.setTextColor(Color.BLACK);
                getSupportFragmentManager().beginTransaction().replace(R.id.activity_main_fragment,
                        workFragment).commit();
            }
        };
        tv_work.setOnClickListener(listener);

    }

    public void login(View v){
        Toast.makeText(MainActivity.this, "You clicked login", Toast.LENGTH_SHORT).show();
    }

    public void submit(View v){
        //tv_subshow = (TextView) findViewById(R.id.activity_tool_subshow);
        Toast toast = Toast.makeText(MainActivity.this, "You can do it", Toast.LENGTH_SHORT);
        // toast.setView(tv_subshow);
        toast.show();
    }
}
