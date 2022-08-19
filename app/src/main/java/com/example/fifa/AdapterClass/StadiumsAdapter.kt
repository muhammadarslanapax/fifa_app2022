package com.example.fifa.AdapterClass

import Stadiums
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fifa.DataModalClass.Stadiumdata
import com.example.fifa.R

class StadiumsAdapter(val list:List<Stadiumdata>, val activity: Stadiums):

    RecyclerView.Adapter<StadiumsAdapter.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        return ViewHolderClass(LayoutInflater.from(parent.context).inflate(R.layout.stidums_simples,parent,false))
    }
    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
         val modalClass:Stadiumdata = list[position]



        holder.std_high_des.setText(modalClass.std_high_des)
        holder.std_high.setText(modalClass.std_high)
        holder.std_name.setText(modalClass.std_name)
        holder.std_cap.setText(modalClass.std_cap)
        holder.std_des.setText(modalClass.std_des)
        Glide.with(activity).load(modalClass.std_image).into(holder.std_image)



    }

    override fun getItemCount(): Int {
      return list.size
    }

    class ViewHolderClass(itemView:View) : RecyclerView.ViewHolder(itemView)  {

        val std_name:TextView

        val std_image:ImageView
        val std_cap:TextView

        val std_des:TextView

        val std_high:TextView

        val std_high_des:TextView







        init {
            std_name = itemView.findViewById(R.id.std_name)
            std_high = itemView.findViewById(R.id.std_high)
            std_high_des = itemView.findViewById(R.id.std_high_des)
            std_image = itemView.findViewById(R.id.std_img)
            std_des = itemView.findViewById(R.id.std_des)
            std_cap = itemView.findViewById(R.id.std_cap)











       }




    }



}