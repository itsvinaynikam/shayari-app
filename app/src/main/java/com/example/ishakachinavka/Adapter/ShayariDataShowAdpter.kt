package com.example.ishakachinavka.Adapter

import android.R.attr.text
import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.databinding.ShowshayariDesignlayoutBinding


class ShayariDataShowAdpter(var context: Context, var datalist:MutableList<Shayari>): RecyclerView.Adapter<ShayariDataShowAdpter.Myviewholder>() {

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
        holder.binding.shayariTextview.text=datalisst.text


        holder.binding.copyBtn.setOnClickListener {


            val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager?
            val clip = ClipData.newPlainText("msg",datalist.get(position).text)

            Log.e("shayarii", "onBindViewHolder: "+datalist.get(position).text)
            assert(clipboard != null)
            clipboard!!.setPrimaryClip(clip)
            Toast.makeText(context, "Copied To Clipboard !", Toast.LENGTH_SHORT).show()




        }

        holder.binding.favBtn.setOnClickListener {
            Toast.makeText(context, "fav", Toast.LENGTH_SHORT).show()


        }
        holder.binding.shareBtn.setOnClickListener {
            Toast.makeText(context, "share", Toast.LENGTH_SHORT).show()





        }

    }



/*

    fun setitem(datalisst: ArrayList<UserCategory>)
    {
        this.datalist=datalisst
        notifyDataSetChanged()
    }

*/


}