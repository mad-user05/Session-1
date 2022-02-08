package com.example.myapplication.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.HorizontalScrollView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.MovieActivity
import com.example.myapplication.R
import com.example.myapplication.main.model.UpModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //val lisfOf =
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = Adapter()
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter

    }
    //49:B3:4D:E3:58:6E:F0:46:B5:5D:8E:8C:D1:D7:AD:74:B1:EF:58:66 ( SHA1 )

    fun film(view: View) {
        val intent = Intent(this, MovieActivity::class.java)
                startActivity(intent)
    }
}