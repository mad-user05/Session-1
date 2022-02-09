package com.example.myapplication.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.movie.MovieActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    //val lisfOf =
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        val service = Inter.api
        val call : Call<UpModel> = service.getUp()
        call.equery(){
            /*val adapter = Adapter()
            rv.adapter = adapter
            rv.layoutManager = LinearLayoutManager(this)
            rv.adapter*/
        }
*/


    }
    //49:B3:4D:E3:58:6E:F0:46:B5:5D:8E:8C:D1:D7:AD:74:B1:EF:58:66 ( SHA1 )

    fun film(view: View) {
        val intent = Intent(this, MovieActivity::class.java)
                startActivity(intent)
    }
}