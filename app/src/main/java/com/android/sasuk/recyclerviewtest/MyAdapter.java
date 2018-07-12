package com.android.sasuk.recyclerviewtest;

import android.content.Context;
import android.graphics.ColorSpace;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


    public Context mContext;
    private ArrayList<Model> arrList;
    public MyAdapter(Context mContext , ArrayList<Model> arrList) {
        this.mContext = mContext;
        this.arrList=arrList;
        LinearLayout linearLayout ;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i ) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);


        View view =layoutInflater.inflate(R.layout.view_raw,viewGroup , false);
        final ViewHolder viewHolder = new ViewHolder(view);

        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                Toast.makeText(mContext , arrList.get(viewHolder.getAdapterPosition()).getName(),Toast.LENGTH_SHORT).show();

            }
        });






        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Model model = arrList.get(i);


        TextView name = null;
        TextView disc = null;
        name = viewHolder.tV1;
        disc = viewHolder.tV2;

        name.setText(model.getName());
        disc.setText(model.getDisc());





    }

    @Override
    public int getItemCount() {
        return arrList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
     TextView tV1 = null;
     TextView tV2 = null;
     LinearLayout linearLayout;
        public  ViewHolder (View itemView) {
            super(itemView);
            linearLayout=itemView.findViewById(R.id.linearLayout);
            tV1 = itemView.findViewById(R.id.txtName);
            tV2 = itemView.findViewById(R.id.txtbntklb);


        }


    }
}
