package com.example.septisodium;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ExpendableListAdapter extends BaseExpandableListAdapter {
    Context context ;
    ExpandableListView expandableListView ;
    ArrayList<String> head ;
    ArrayList<ArrayList<String>> body ;
    public  ExpendableListAdapter(Context context, ExpandableListView expandableListView,ArrayList<String> head,ArrayList<ArrayList<String>> body  ){
        this.context =context ;
        this.expandableListView=expandableListView;
        this.head=head;
        this.body = body;
    }
    @Override
    public int getGroupCount() {
        return head.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return body.get(groupPosition).size() ;
    }

    @Override
    public String getGroup(int groupPosition) {
        return head.get(groupPosition);
    }

    @Override
    public String getChild(int groupPosition, int childPosition) {
        return body.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(final int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate((R.layout.layout_group), null);
        }
        TextView title = convertView.findViewById(R.id.groupe);
        title.setText(getGroup(groupPosition));
        title.setOnClickListener(new TextView.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (expandableListView.isGroupExpanded(groupPosition)){
                    expandableListView.collapseGroup(groupPosition);
                }else {
                    expandableListView.expandGroup(groupPosition);
                }
            }
        });

        return convertView ;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate((R.layout.layout_child), null);
        }
        TextView title = convertView.findViewById(R.id.t_title);
        title.setText(getChild(groupPosition,childPosition));


        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
