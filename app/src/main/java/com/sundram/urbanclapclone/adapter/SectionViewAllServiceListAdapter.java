package com.sundram.urbanclapclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.datamodel.SectionViewAllServiceListModel;

import java.util.ArrayList;

public class SectionViewAllServiceListAdapter extends RecyclerView.Adapter<SectionViewAllServiceListAdapter.ListHolder> {

    private View section_view;
    private Context mContext;
    private ArrayList<SectionViewAllServiceListModel> mList;
    private OnServiceItemClick onServiceItemClick;

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

        ImageView productImage;
        TextView serviceName, rupee, rupeeOff, type_of_service, timeOfService;


        public ListHolder(@NonNull View itemView, OnServiceItemClick onServiceItemClick) {
            super(itemView);

            productImage = itemView.findViewById(R.id.view_all_service_list_item_image);

            serviceName = itemView.findViewById(R.id.title_tv);
            rupee = itemView.findViewById(R.id.price_tv);
            rupeeOff = itemView.findViewById(R.id.offer_price);
            type_of_service = itemView.findViewById(R.id.type_of_service);
            timeOfService = itemView.findViewById(R.id.serviceTime);

        }

        void setData(SectionViewAllServiceListModel data) {

            productImage.setImageResource(data.getDrawable());
            serviceName.setText(data.getServiceName());
            rupee.setText(data.getRupee());
            rupeeOff.setText(data.getOffRupe());
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
