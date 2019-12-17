package com.sundram.urbanclapclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.datamodel.CarpenterDataModel;

import java.util.ArrayList;

public class PECAdapter extends RecyclerView.Adapter<PECAdapter.DataHolder> {

    private View pecView;
    private Context mContext;
    private ArrayList<CarpenterDataModel> list;
    private OnServiceItemClick onServiceItemClick;

    public PECAdapter(Context mContext, ArrayList<CarpenterDataModel> list, OnServiceItemClick onServiceItemClick) {
        this.mContext = mContext;
        this.list = list;
        this.onServiceItemClick = onServiceItemClick;
    }

    @NonNull
    @Override
    public PECAdapter.DataHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        pecView = LayoutInflater.from(mContext).inflate(R.layout.secton_view_all_plumber_carpenter,parent,false);
        return new DataHolder(pecView, onServiceItemClick);
    }

    @Override
    public void onBindViewHolder(@NonNull PECAdapter.DataHolder holder, int position) {
        CarpenterDataModel data = list.get(position);
        holder.setDetails(data);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class DataHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView serviceName, price, offPrice;
        OnServiceItemClick onServiceItemClick;
        public DataHolder(@NonNull View itemView, OnServiceItemClick onServiceItemClick) {
            super(itemView);

            serviceName = itemView.findViewById(R.id.serviceName);
            price = itemView.findViewById(R.id.txt_price);
            offPrice = itemView.findViewById(R.id.txt_price_off);
            this.onServiceItemClick=onServiceItemClick;
            itemView.setOnClickListener(this);
        }
        void setDetails(CarpenterDataModel data){
            serviceName.setText(data.getServiceName());
            price.setText(data.getRupee());
            offPrice.setText(data.getRupeeOff());
        }

        @Override
        public void onClick(View v) {
            onServiceItemClick.OnClick(getAdapterPosition());
        }
    }
    public static interface OnServiceItemClick{
        public void OnClick(int position);
    }
}
