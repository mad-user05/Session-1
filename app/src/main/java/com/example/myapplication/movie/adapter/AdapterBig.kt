package com.example.myapplication.movie.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.movie.adapter.models.ModelTwo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.card_view_two.*

class AdapterBig(val dataSet: Array<ModelTwo>, val context: AppCompatActivity) :
    RecyclerView.Adapter<AdapterBig.HolderB>() {
    inner class HolderB(itemView: View) : RecyclerView.ViewHolder(itemView) {
        protected val img1: ImageView = context.img_view
        protected val tv_name: TextView = context.name_tv
        protected val tv_op: TextView = context.op_tv
        protected val tv_age: TextView = context.year_tv

        fun bind(oiop: ModelTwo) {
            //tv_age.text =
            Glide.with(context).load(oiop.images).into(img1)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderB {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_two, parent, false)

        return HolderB(view)
    }

    override fun onBindViewHolder(holder: HolderB, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size
}