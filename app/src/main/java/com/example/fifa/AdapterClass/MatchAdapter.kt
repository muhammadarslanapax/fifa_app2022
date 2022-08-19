package com.example.fifa.AdapterClass

import Matches
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fifa.DataModalClass.MatchData
import com.example.fifa.R

class MatchAdapter(val list:List<MatchData>, val activity: Matches):

    RecyclerView.Adapter<MatchAdapter.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        return ViewHolderClass(LayoutInflater.from(parent.context).inflate(R.layout.activity_match_simple,parent,false))
    }
    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
         val modalClass:MatchData = list[position]

        holder.countryb1.setText(modalClass.country1.toString())
        holder.countryb2.setText(modalClass.country2.toString())
        Glide.with(activity).load(modalClass.flag1).into(holder.flagb1)
        Glide.with(activity).load(modalClass.flag2).into(holder.flagb2)
        holder.date1.setText(modalClass.date.toString())
        holder.date2.setText(modalClass.date2.toString())
        holder.time.setText(modalClass.time.toString())
        holder.std.setText(modalClass.std.toString())

    }

    override fun getItemCount(): Int {
      return list.size
    }

    class ViewHolderClass(itemView:View) : RecyclerView.ViewHolder(itemView)  {

        val date1:TextView

        val flagb1:ImageView
        val countryb1:TextView

        val date2:TextView
        val flagb2:ImageView
        val time:TextView

        val countryb2:TextView
        val std :TextView






        init {

            date1=itemView.findViewById(R.id. date1)
            countryb1 = itemView.findViewById(R.id.countryb1)
            flagb1 = itemView.findViewById(R.id.flagb1)
            date2 = itemView.findViewById(R.id.date2)

            flagb2= itemView.findViewById(R.id.flagb2)
            time = itemView.findViewById(R.id.time)
            countryb2= itemView.findViewById(R.id.countryb2)
            std= itemView.findViewById(R.id.std)









       }




    }



}