package com.example.wscubeprojs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.ViewHolder> {
    Context context;
    ArrayList<structurerecycle> arrayList;
    private int lastposition = -1;
    recyclerAdapter(Context context,ArrayList<structurerecycle> arrayList){
        this.context = context;
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerlayout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.image.setImageResource(arrayList.get(position).image);
        holder.txtnumber.setText(arrayList.get(position).number);
        holder.txtName.setText(arrayList.get(position).name);
        holder.setAnim(holder.itemView,position);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView txtName,txtnumber;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.imageView2);
            txtName=itemView.findViewById(R.id.name);
            txtnumber=itemView.findViewById(R.id.number);
        }
        private void setAnim(View viewToAnimate,int position){
            if(position>lastposition) {

                Animation SlideIn = AnimationUtils.loadAnimation(context, android.R.anim.fade_out);
                viewToAnimate.startAnimation(SlideIn);
                lastposition=position;
            }
        }
    }
}
