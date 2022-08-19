package com.example.fifa.AdapterClass

import Titles
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fifa.DataModalClass.WinnersData
import com.example.fifa.R

class WinnerAdapter(val list:List<WinnersData>, val activity: Titles):

    RecyclerView.Adapter<WinnerAdapter.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        return ViewHolderClass(LayoutInflater.from(parent.context).inflate(R.layout.winner,parent,false))
    }
    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
         val modalClass:WinnersData = list[position]




        Glide.with(activity).load(modalClass.winner_image).into(holder.winner_image)
        holder.winner_year.setText(modalClass.winner_year.toString())
        holder.winner_name.setText(modalClass.winner_name.toString())



    }

    override fun getItemCount(): Int {
      return list.size
    }

    class ViewHolderClass(itemView:View) : RecyclerView.ViewHolder(itemView)  {

        val winner_name:TextView

        val winner_image:ImageView
        val winner_year:TextView









        init {

            winner_image = itemView.findViewById(R.id.winnerimage)
           winner_name = itemView.findViewById(R.id.winner_name)
            winner_year = itemView.findViewById(R.id.winner_year)











       }




    }



}