package com.example.wscubeprojs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recycleAddAdapter extends RecyclerView.Adapter<recycleAddAdapter.ViewHolder> {
    Context context;
    EditText editname,editnumber;
    Button add;
    TextView addnew;
    private int lastposition = -1;

    ArrayList<recycleAddStructure>arrayList;
     recycleAddAdapter(Context context, ArrayList<recycleAddStructure> arrayList){
        this.context = context;
        this.arrayList = arrayList;

    }
    @NonNull
    @Override
    public recycleAddAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycleaddlayout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull recycleAddAdapter.ViewHolder holder, int position) {
    holder.img.setImageResource(arrayList.get(position).img);
    holder.name.setText(arrayList.get(position).name);
    holder.number.setText(arrayList.get(position).number);
    holder.setAnimation(holder.itemView,position);
    holder.cardView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.update);
            editname = dialog.findViewById(R.id.editName);
            editnumber = dialog.findViewById(R.id.editNumber);
            addnew = dialog.findViewById(R.id.addnew);
            add = dialog.findViewById(R.id.Add);
            add.setText("Update");
            addnew.setText("UPDATE");

            editname.setText(arrayList.get(position).name);
            editnumber.setText(arrayList.get(position).number);

            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name,number;

                    if(editname.getText().toString().equals("") &&  editnumber.getText().toString().equals("")){
                        Toast.makeText(context, "Add details first", Toast.LENGTH_SHORT).show();
                    }

                    name = editname.getText().toString();
                    number = editnumber.getText().toString();

                    arrayList.set(position,new recycleAddStructure(name,number));
                    notifyItemChanged(position);
                    dialog.dismiss();
                }
            });
            dialog.show();
        }
    });
    holder.cardView.setOnLongClickListener(new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("Delete");
            builder.setMessage("Are you sure you want to delete");
            builder.setIcon(R.drawable.baseline_delete_24);
            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    arrayList.remove(position);
                    notifyItemRemoved(position);
                }
            });

            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
//                    do nothing
                    dialog.dismiss();
                }
            });
            builder.show();
            return true;
        }
    });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView name,number;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
            number = itemView.findViewById(R.id.number);
            cardView = itemView.findViewById(R.id.carview);
        }
        private void setAnimation(View viewToSet,int position){
            if(position>lastposition){
            Animation slideIn = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToSet.startAnimation(slideIn);

                lastposition=position;
            }
        }
    }
}
