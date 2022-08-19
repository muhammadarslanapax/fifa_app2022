package com.example.fifa.AdapterClass

import Groups
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fifa.DataModalClass.GroupsData
import com.example.fifa.R

class GrpupsAdapter(val list:List<GroupsData>, val activity: Groups):

    RecyclerView.Adapter<GrpupsAdapter.ViewHolderClass>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        return ViewHolderClass(LayoutInflater.from(parent.context).inflate(R.layout.group_simple_design,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
         val modalClass:GroupsData = list[position]


     holder.groupname.setText(modalClass.group_name.toString())
        holder.no1.setText(modalClass.no1.toString())
        Glide.with(activity).load(modalClass.flag1).into(holder.flag1)
        holder.text1.setText(modalClass.country1.toString())
//
//
//
//
//
//
//
//
        holder.no2.setText(modalClass.no2.toString())
        Glide.with(activity).load(modalClass.flag2).into(holder.flag2)
        holder.text2.setText(modalClass.country2.toString())

//
//
//
//
//
//
//
//
        holder.no3.setText(modalClass.no3.toString())
        Glide.with(activity).load(modalClass.flag3).into(holder.flag3)
        holder.text3.setText(modalClass.country3.toString())








//
        holder.no4.setText(modalClass.no4.toString())
        Glide.with(activity).load(modalClass.flag4).into(holder.flag4)
        holder.text4.setText(modalClass.country4.toString())


    }

    override fun getItemCount(): Int {
      return list.size
    }

    class ViewHolderClass(itemView:View) : RecyclerView.ViewHolder(itemView)  {

        val groupname:TextView
        val no1:TextView
        val flag1:ImageView
        val text1:TextView

        val no2:TextView
        val flag2:ImageView
        val text2:TextView

        val no3:TextView
        val flag3:ImageView
        val text3:TextView


        val no4:TextView
        val flag4:ImageView
        val text4:TextView





        init {

            groupname=itemView.findViewById(R.id.group_tv)
            no1 = itemView.findViewById(R.id.no1)
            flag1 = itemView.findViewById(R.id.flag1)
            text1 = itemView.findViewById(R.id.text1)

            no2 = itemView.findViewById(R.id.no2)
            flag2 = itemView.findViewById(R.id.flag2)
            text2 = itemView.findViewById(R.id.text2)


            no3 = itemView.findViewById(R.id.no3)
            flag3 = itemView.findViewById(R.id.flag3)
            text3 = itemView.findViewById(R.id.text3)

            no4 = itemView.findViewById(R.id.no4)
            flag4 = itemView.findViewById(R.id.flag4)
            text4 = itemView.findViewById(R.id.text4)







       }




    }



}