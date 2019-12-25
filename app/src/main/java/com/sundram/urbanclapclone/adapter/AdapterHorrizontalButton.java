package com.sundram.urbanclapclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sundram.urbanclapclone.R;
import com.sundram.urbanclapclone.datamodel.DataModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AdapterHorrizontalButton extends RecyclerView.Adapter<AdapterHorrizontalButton.ButtonViewHolder> {

    private ArrayList<DataModel> btnList;
    private Context mContext;
    private View btnView;


    public AdapterHorrizontalButton(ArrayList<DataModel> btnList, Context mContext) {
        this.mContext = mContext;
        this.btnList = btnList;
    }

    @NonNull
    @Override
    public ButtonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        btnView = LayoutInflater.from(mContext).inflate(R.layout.single_view_all_service_button_scrolling_btn,parent,false);
        return new ButtonViewHolder(btnView);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonViewHolder holder, int position) {
        DataModel data = btnList.get(position);
        holder.btn.setText(data.getDetails());
    }

    @Override
    public int getItemCount() {
        return btnList.size();
    }

    public class ButtonViewHolder extends RecyclerView.ViewHolder{

        Button btn;
        public ButtonViewHolder(@NonNull View itemView) {
            super(itemView);
            btn = itemView.findViewById(R.id.horizontalBtn);
        }
    }
}
