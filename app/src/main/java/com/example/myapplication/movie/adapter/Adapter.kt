package com.example.myapplication.movie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.movie.adapter.models.ModelFirst
import kotlinx.android.synthetic.main.card_view.*

class Adapter(private val dataSet: Array<ModelFirst>, val context : AppCompatActivity) : RecyclerView.Adapter<Adapter.HolderOp>() {
    inner class HolderOp(itemView: View) : RecyclerView.ViewHolder(itemView){
        protected val img1 : ImageView = context.img_card

        fun bind(oiop : ModelFirst){
                    Glide.with(context).load(oiop.images).into(img1) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderOp {
        val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.card_view, parent, false)

                return HolderOp(view)
    }

    override fun onBindViewHolder(holder: HolderOp, position: Int) {
     holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size
}

