package com.example.septisodium;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.MyViewHolder>{
Context context ;
List<objectTemoin> objectTemoinList ;

    public RecyclerviewAdapter(Context context, List<objectTemoin> objectTemoinList) {
        this.context = context;
        this.objectTemoinList = objectTemoinList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v ;
        v= LayoutInflater.from((context)).inflate(R.layout.card_object_temoin,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(objectTemoinList.get(position).getName());
        holder.caracteristique1.setText(objectTemoinList.get(position).getCaracteristique1());
        holder.caracteristique2.setText(objectTemoinList.get(position).getCaracteristique2());
        holder.caracteristique3.setText(objectTemoinList.get(position).getCaracteristique3());
    }

    @Override
    public int getItemCount() {
        return objectTemoinList.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder{
            private TextView tv_name ;
        private TextView caracteristique1 ;
        private TextView caracteristique2 ;
        private TextView caracteristique3 ;
           public MyViewHolder( View itemView) {
               super(itemView);
               tv_name= (TextView) itemView.findViewById(R.id.name);
               caracteristique1 =(TextView) itemView.findViewById(R.id.caracteristique1);
               caracteristique2=(TextView) itemView.findViewById(R.id.caracteristique2);
               caracteristique3=(TextView) itemView.findViewById(R.id.caracteristique3);
           }
       }


        }

