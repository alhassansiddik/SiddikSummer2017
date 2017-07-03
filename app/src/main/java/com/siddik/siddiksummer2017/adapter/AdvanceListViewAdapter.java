package com.siddik.siddiksummer2017.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.siddik.siddiksummer2017.R;
import com.siddik.siddiksummer2017.util.UtilDensity;

import java.util.ArrayList;

/**
 * Created by Sidleh on 6/19/2017.
 */

public class AdvanceListViewAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<String> list;
    private final LayoutInflater inflater;

    public AdvanceListViewAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater)context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.activity_advance_list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.rl_even = (RelativeLayout) convertView.findViewById(R.id.even);
            viewHolder.rl_odd = (RelativeLayout) convertView.findViewById(R.id.odd);
            viewHolder.tv = (TextView) convertView.findViewById(R.id.activity_advance_list_item_tv);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder)convertView.getTag();
        }

        viewHolder.tv.setText(list.get(position));
        viewHolder.lp = new RelativeLayout.LayoutParams
                (RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.MATCH_PARENT);

        if(position%2==0){
            //msg from you
            viewHolder.rl_odd.setVisibility(View.INVISIBLE);
            viewHolder.rl_even.setVisibility(View.VISIBLE);
            viewHolder.tv.setBackgroundResource(R.drawable.chatto_bg_focused);
            viewHolder.lp.setMargins(0,0,UtilDensity.dip2px(context,70),0);
            viewHolder.lp.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            viewHolder.tv.setLayoutParams(viewHolder.lp);
        } else {
            //msg from friends
            viewHolder.rl_odd.setVisibility(View.VISIBLE);
            viewHolder.rl_even.setVisibility(View.INVISIBLE);
            viewHolder.tv.setBackgroundResource(R.drawable.chatfrom_bg_focused);
            viewHolder.lp.setMargins(UtilDensity.dip2px(context,70),0,0,0);
            viewHolder.lp.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            viewHolder.tv.setLayoutParams(viewHolder.lp);
        }
        return convertView;
    }

    private class ViewHolder{
        RelativeLayout rl_odd;
        RelativeLayout rl_even;
        TextView tv;
        RelativeLayout.LayoutParams lp;
    }
}
