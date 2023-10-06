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
import com.example.ishakachinavka.Model.Favshayari
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.SharedPreference.SharedPreferencee
import com.example.ishakachinavka.databinding.ShowshayariDesignlayoutBinding

class FavShayariAdapter(var context: Context, var favshayariDatalist:MutableList<Favshayari>): RecyclerView.Adapter<FavShayariAdapter.Myviewholder>() {

    lateinit var binding: ShowshayariDesignlayoutBinding

    lateinit var favoritesPref: SharedPreferencee

    val db = Room.databaseBuilder(context ,AppDatabase::class.java, "favoriteshayari").allowMainThreadQueries().build()


    class Myviewholder(var binding: ShowshayariDesignlayoutBinding) : RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        binding= ShowshayariDesignlayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return Myviewholder(binding)

    }

    override fun getItemCount(): Int {
        return favshayariDatalist.size
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {

        var favlist=favshayariDatalist[position]
        holder.binding.shayariTextview.text=favlist.text

        favoritesPref = SharedPreferencee(context)

        val  isFavorite = favoritesPref.getFavShayari(favlist.id.toString(), false)

        val favoriteIcon: Int =
            if (isFavorite)
                com.example.ishakachinavka.R.drawable.fav_heart_icon  else com.example.ishakachinavka.R.drawable.unfav_heart_icon
        holder.binding.favBtn.setImageResource(favoriteIcon)



//  Buttons
        holder.binding.favBtn.setOnClickListener {
            val newFavoriteStatus = !isFavorite
            favoritesPref.setFavShayari(favlist.id.toString(), newFavoriteStatus)

            // Update the icon
            holder.binding.favBtn.setImageResource(if (newFavoriteStatus){
                com.example.ishakachinavka.R.drawable.fav_heart_icon

            }
            else
            { var deleteFavShayarir= Favshayari(id = favshayariDatalist.get(position).id, text = favshayariDatalist.get(position).text)
                db.userDao().delete(deleteFavShayarir)
                deleteDataRefesh(db.userDao().gelAllUsers())
                com.example.ishakachinavka.R.drawable.unfav_heart_icon

            })
            notifyDataSetChanged()

        }
        holder.binding.copyBtn.setOnClickListener {

            val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager?
            val clip = ClipData.newPlainText("msg",favshayariDatalist.get(position).text)

            Log.e("shayarii", "onBindViewHolder: "+favshayariDatalist.get(position).text)
            assert(clipboard != null)
            clipboard!!.setPrimaryClip(clip)
            Toast.makeText(context, "Copied To Clipboard !", Toast.LENGTH_SHORT).show()

        }

        holder.binding.shareBtn.setOnClickListener {
            try {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name")
                var shareMessage = "\n${favshayariDatalist.get(position).text}\n\n"
                /* shareMessage =
                     """
                             ${shareMessage}https://play.google.com/store/apps/details?id=${BuildConfig.APPLICATION_ID}

                           """.trimIndent()*/
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
                context.startActivity(Intent.createChooser(shareIntent, "choose one"))
            } catch (e: Exception) {
                //e.toString();
            }
            true
            //Toast.makeText(context, "share", Toast.LENGTH_SHORT).show()

        }

    }

    private fun deleteDataRefesh(gelAllUsers: MutableList<Favshayari>)
    {
        this.favshayariDatalist=gelAllUsers
        notifyDataSetChanged()

    }


    /*fun setitem(datalisst: MutableList<Favshayari>)
    {
        this.favshayariDatalist=datalisst
        notifyDataSetChanged()
    }*/




}


