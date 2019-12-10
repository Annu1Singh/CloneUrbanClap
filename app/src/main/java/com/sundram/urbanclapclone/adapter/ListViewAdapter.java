package com.sundram.urbanclapclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.datamodel.ServiceName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {

    // Declare Variables

    Context mContext;
    LayoutInflater inflater;
    private List<ServiceName> serviceNameList = null;
    private ArrayList<ServiceName> arraylist;

    public ListViewAdapter(Context context, List<ServiceName> serviceNameList) {
        mContext = context;
        this.serviceNameList = serviceNameList;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<ServiceName>();
        this.arraylist.addAll(serviceNameList);
    }

    public class ViewHolder {
        TextView name;
    }

    @Override
    public int getCount() {
        return serviceNameList.size();
    }

    @Override
    public ServiceName getItem(int position) {
        return serviceNameList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.row_item, null);
            // Locate the TextViews in listview_item.xml
            holder.name = (TextView) view.findViewById(R.id.name);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.name.setText(serviceNameList.get(position).getServiceName());
        return view;
    }

    // Filter Class
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        serviceNameList.clear();
        if (charText.length() == 0) {
            serviceNameList.addAll(arraylist);
        } else {
            for (ServiceName wp : arraylist) {
                if (wp.getServiceName().toLowerCase(Locale.getDefault()).contains(charText)) {
                    serviceNameList.add(wp);
                }
            }
        }
        notifyDataSetChanged();
    }

}