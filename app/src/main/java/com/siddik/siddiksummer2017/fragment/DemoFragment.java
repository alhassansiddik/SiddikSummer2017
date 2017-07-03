package com.siddik.siddiksummer2017.fragment;


import android.content.Context;
import android.content.Intent;
import android.gesture.Gesture;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.siddik.siddiksummer2017.ActivityA;
import com.siddik.siddiksummer2017.AdvanceListViewActivity;
import com.siddik.siddiksummer2017.AdvanceViewPagerActivity;
import com.siddik.siddiksummer2017.AnimationActivity;
import com.siddik.siddiksummer2017.AnimatorActivity;
import com.siddik.siddiksummer2017.CheckBoxActivity;
import com.siddik.siddiksummer2017.DialogActivity;
import com.siddik.siddiksummer2017.GestureActivity;
import com.siddik.siddiksummer2017.HandlerActivity;
import com.siddik.siddiksummer2017.NinePatchActivity;
import com.siddik.siddiksummer2017.NotificationActiity;
import com.siddik.siddiksummer2017.R;
import com.siddik.siddiksummer2017.RadioGroupActivity;
import com.siddik.siddiksummer2017.ResultActivity;
import com.siddik.siddiksummer2017.RunnableHandlerActivity;
import com.siddik.siddiksummer2017.ScaleTypeActivity;
import com.siddik.siddiksummer2017.SharedPreferenceActivity;
import com.siddik.siddiksummer2017.ViewPagerActivity;
import com.siddik.siddiksummer2017.adapter.ListNormalAdapter;
import com.siddik.siddiksummer2017.audio.BaseBean;

import java.util.ArrayList;

public class DemoFragment extends Fragment {

    private ListView listView;
    private final ArrayList<String> contentList;
    private final Context context;


    public DemoFragment() {
        // Required empty public constructor
        context = getContext();

        contentList = new ArrayList<String>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("9Patch");
        contentList.add("Notification");
        contentList.add("AdvanceListView");
        contentList.add("AdvanceViewPager");
        contentList.add("LaunchMode");
        contentList.add("ActivityResult");
        contentList.add("RadioGroup");
        contentList.add("CheckBox");
        contentList.add("Dialog");
        contentList.add("Handler");
        contentList.add("HandlerRunnable");
        contentList.add("Animation");
        contentList.add("Animator");
        contentList.add("Gesture");
        contentList.add("SharedPreference");
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView = (ListView)view.findViewById(R.id.fragment_demo_lv);

        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(), contentList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent0 = new Intent(getActivity(), ViewPagerActivity.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(getActivity(), NinePatchActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), NotificationActiity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), AdvanceListViewActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), AdvanceViewPagerActivity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), ActivityA.class);
//                        intent6.putExtra("StringInfo","FromDemoFragment");
//                        intent6.putExtra("IntegerInfo",10);
//                        Bundle bundle = new Bundle();
//                        BaseBean bean = new BaseBean();
//                        bean.setName("bean");
//                        bundle.putString("StringBundle","FromBundleDemo");
//                        bundle.putInt("IntegerBundle", 101);
//                        bundle.putSerializable("Object",bean);
//                        intent6.putExtra("Bundle",bundle);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(getActivity(), ResultActivity.class);
                        startActivityForResult(intent7,400);
                        break;
                    case 8:
                        Intent intent8 = new Intent(getActivity(), RadioGroupActivity.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(getActivity(), CheckBoxActivity.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(getActivity(), DialogActivity.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(getActivity(), HandlerActivity.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(getActivity(), RunnableHandlerActivity.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(getActivity(), AnimationActivity.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(getActivity(), AnimatorActivity.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(getActivity(), GestureActivity.class);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(getActivity(), SharedPreferenceActivity.class);
                        startActivity(intent16);
                        break;
                    default:
                }
            }
        });

        return view;
    }

}
