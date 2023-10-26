package com.example.ishakachinavka.Adapter

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.ishakachinavka.Class.AppDatabase
import com.example.ishakachinavka.Model.ButtonIconModel
import com.example.ishakachinavka.Model.Favshayari
import com.example.ishakachinavka.SharedPreference.SharedPreferencee
import com.example.ishakachinavka.databinding.ShowshayariDesignlayoutBinding
import com.example.ishakachinavka.databinding.SubtitleButtonlayoutDesignBinding


class ShowButtonsAdapter(var context: Context, var favshayariDatalist:MutableList<ButtonIconModel>): RecyclerView.Adapter<ShowButtonsAdapter.Myviewholder>() {

    lateinit var binding: SubtitleButtonlayoutDesignBinding

    class Myviewholder(var binding:SubtitleButtonlayoutDesignBinding) : RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        binding= SubtitleButtonlayoutDesignBinding.inflate(LayoutInflater.from(context),parent,false)
        return Myviewholder(binding)

    }

    override fun getItemCount(): Int {
        return favshayariDatalist.size
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {

        var favlist=favshayariDatalist[position]
        holder.binding.btnShayaritext.text=favlist.shayrititle
        holder.binding.subIcon.setImageResource(favshayariDatalist.get(position).subicon)

    }






}
