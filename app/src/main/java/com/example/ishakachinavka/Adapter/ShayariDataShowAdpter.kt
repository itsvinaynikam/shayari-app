package com.example.ishakachinavka.Adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ishakachinavka.Model.IntroScreenItem
import com.example.ishakachinavka.databinding.ShowshayariDesignlayoutBinding


class ShayariDataShowAdpter(var context: Context, var datalist:MutableList<String>): RecyclerView.Adapter<ShayariDataShowAdpter.Myviewholder>() {

    lateinit var binding: ShowshayariDesignlayoutBinding

    class Myviewholder(var binding: ShowshayariDesignlayoutBinding) : RecyclerView.ViewHolder(binding.root){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        binding= ShowshayariDesignlayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return Myviewholder(binding)

    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {

        var datalisst=datalist[position]

        holder.binding.shayariTextview.text=datalisst
       /* holder.binding.textDate2.text=datalisst.date
        holder.binding.textDay2.text=datalisst.day
        holder.binding.textintime3.text=datalisst.intime
        holder.binding.textOutTime2.text=datalisst.outtime*/

    }



/*

    fun setitem(datalisst: ArrayList<UserCategory>)
    {
        this.datalist=datalisst
        notifyDataSetChanged()
    }

*/


}