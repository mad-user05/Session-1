package com.example.myapplication.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.main.model.UpModel
import kotlinx.android.synthetic.main.activity_main.*

class Adapter(private val dataSet: Array<UpModel>, val context : AppCompatActivity) : RecyclerView.Adapter<Adapter.HolderOp>() {
    inner class HolderOp(itemView: View) : RecyclerView.ViewHolder(itemView){
        protected val img1 : ImageView = context.id_img

        private fun bind(oiop : UpModel){
                    Glide.with(context).load(oiop.backgroundImage).into(img1) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderOp {
        val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.card_view, parent, false)

                return HolderOp(view)
    }

    override fun onBindViewHolder(holder: HolderOp, position: Int) {
     // holder.toString() = dataSet[position].toString()
    }

    override fun getItemCount(): Int = dataSet.size
}

