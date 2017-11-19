package com.example.pc.ilactakipsistemi;

import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder>{
    public ArrayList<String> ilaclar;

    public class MyViewHolder extends  RecyclerView.ViewHolder {

        public TextView ilacadi;


        public MyViewHolder(View itemView) {
            super(itemView);
            ilacadi = (TextView)itemView.findViewById(R.id.ilacadi);
        }
    }
    public  myAdapter (ArrayList<String> ilaclar){
        this.ilaclar = ilaclar;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.ilacadi.setText(ilaclar.get(position).toString());
    }


    @Override
    public int getItemCount() {
        return ilaclar.size();
    }

}
