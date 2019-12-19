package com.sundram.urbanclapclone.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.datamodel.SectionViewAllServiceListModel;
import com.sundram.urbanclapclone.viewallserviceactivity.salonathome.ViewAllServiceActivity;

import java.util.ArrayList;

public class SectionViewAllServiceListAdapter extends RecyclerView.Adapter<SectionViewAllServiceListAdapter.ListHolder> {

    private View section_view;
    private Context mContext;
    private ArrayList<SectionViewAllServiceListModel> mList;
    private OnServiceItemClick onServiceItemClick;
    private ViewAllServiceActivity viewAllServiceActivity = new ViewAllServiceActivity();
    int x = 0;

    public SectionViewAllServiceListAdapter(Context mContext, ArrayList<SectionViewAllServiceListModel> mList, OnServiceItemClick onServiceItemClick) {
        this.mContext = mContext;
        this.mList = mList;
        this.onServiceItemClick = onServiceItemClick;
    }


    @NonNull
    @Override
    public SectionViewAllServiceListAdapter.ListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        section_view = LayoutInflater.from(mContext).inflate(R.layout.secton_view_all_service_list, parent, false);
        return new ListHolder(section_view, onServiceItemClick);
    }

    @Override
    public void onBindViewHolder(@NonNull SectionViewAllServiceListAdapter.ListHolder holder, int position) {
            SectionViewAllServiceListModel datas = mList.get(position);
            holder.setData(datas);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ListHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView productImage;
        private TextView serviceName, rupee, rupeeOff, type_of_service, timeOfService, minus_tvs, add_txt_tvs, plus_tvs;
        private OnServiceItemClick onServiceItemClick;

        public ListHolder(@NonNull View itemView, OnServiceItemClick onServiceItemClick) {
            super(itemView);

            productImage = itemView.findViewById(R.id.view_all_service_list_item_image);


           // minus_tvs = itemView.findViewById(R.id.minus_tv);
          //  add_txt_tvs = itemView.findViewById(R.id.add_txt_tv);
            plus_tvs = itemView.findViewById(R.id.plus_tv);

            serviceName = itemView.findViewById(R.id.title_tv);
            rupee = itemView.findViewById(R.id.price_tv);
            rupeeOff = itemView.findViewById(R.id.offer_price);
            type_of_service = itemView.findViewById(R.id.type_of_service);
            timeOfService = itemView.findViewById(R.id.serviceTime);

            this.onServiceItemClick = onServiceItemClick;

            itemView.setOnClickListener(this);

            //minus_tvs.setOnClickListener(this);
            //add_txt_tvs.setOnClickListener(this);
            //plus_tvs.setOnClickListener(this);

        }

        void setData(SectionViewAllServiceListModel data) {

            productImage.setImageResource(data.getDrawable());
            serviceName.setText(data.getServiceName());
            rupee.setText(" \u20B9  " + data.getRupee());
            rupeeOff.setText(" \u20B9 " + data.getOffRupe() + " off");
            type_of_service.setText(data.getTypeOfService());
            timeOfService.setText(data.getServiceTime());
        }

        @Override
        public void onClick(View v) {
            onServiceItemClick.onClick(getAdapterPosition());
        }
    }

    public static interface OnServiceItemClick {
        public void onClick(int position);
    }
}
