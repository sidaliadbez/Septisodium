package com.example.septisodium;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
        ImageView imageView= v.findViewById(R.id.imagetemoin) ;
        imageView.setOnClickListener(   new ImageView.OnClickListener (){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, StepbyStepActivity.class);
               // ImageView imageView= v.findViewById(R.id.photo);
                //intent.putExtra("photo",imageView.getDrawable().);
//                System.out.println("/////////////// "+imageView.getDrawable());
                context.startActivity(intent);
              //  overridePendingTransition(0,0);
            }
        });


        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(objectTemoinList.get(position).getName());
        holder.caracteristique1.setText(objectTemoinList.get(position).getCaracteristique1());
        holder.caracteristique2.setText(objectTemoinList.get(position).getCaracteristique2());
        holder.caracteristique3.setText(objectTemoinList.get(position).getCaracteristique3());
        holder.imageView.setImageResource(objectTemoinList.get(position).getDrawble());
        if (objectTemoinList.get(position).getCaracteristique1()==""){
            holder.imageView.getLayoutParams().height=350 ;
            holder.imageView.requestLayout();
            //            holder.imageView.setLayoutParams(new ImageView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 120));
        }
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
        private ImageView imageView;
           public MyViewHolder( View itemView) {
               super(itemView);
               tv_name= (TextView) itemView.findViewById(R.id.name);
               caracteristique1 =(TextView) itemView.findViewById(R.id.caracteristique1);
               caracteristique2=(TextView) itemView.findViewById(R.id.caracteristique2);
               caracteristique3=(TextView) itemView.findViewById(R.id.caracteristique3);
               imageView = (ImageView) itemView.findViewById(R.id.imagetemoin);
           }
       }


        }

