package com.example.myapplication.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.movie.MovieActivity
import com.example.myapplication.R
import com.example.myapplication.main.api.Inter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

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

    fun play(view: View) {
        imggfg.visibility = View.INVISIBLE
        imggg.visibility = View.INVISIBLE
        name_film.visibility = View.INVISIBLE
    }

    fun tool(view: View) {
        name_film.visibility = View.INVISIBLE
        imggg.visibility = View.VISIBLE
        imggfg.visibility = View.INVISIBLE
        idmggg.visibility = View.INVISIBLE
        line.visibility = View.INVISIBLE
        time_two.visibility = View.INVISIBLE
        time_one.visibility = View.INVISIBLE
        volume.visibility = View.INVISIBLE
        video.visibility = View.INVISIBLE
        video2.visibility = View.INVISIBLE
        toolbar_id.visibility = View.VISIBLE

    }

    fun back(view: View) {
        name_film.visibility = View.INVISIBLE
        imggg.visibility = View.INVISIBLE
        imggfg.visibility = View.INVISIBLE
        idmggg.visibility = View.VISIBLE
        line.visibility = View.VISIBLE
        time_two.visibility = View.VISIBLE
        time_one.visibility = View.VISIBLE
        volume.visibility = View.VISIBLE
        video.visibility = View.VISIBLE
        video2.visibility = View.VISIBLE
        toolbar_id.visibility = View.INVISIBLE
    }
}