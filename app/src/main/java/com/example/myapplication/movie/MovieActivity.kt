package com.example.myapplication.movie

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.VideoView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.main.api.Inter
import com.example.myapplication.movie.adapter.Adapter
import com.example.myapplication.movie.adapter.models.ModelFirst
import kotlinx.android.synthetic.main.activity_movie.*
import retrofit2.Call
import retrofit2.Callback

class MovieActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val movie : VideoView = findViewById(R.id.video)
        movie.setVideoURI(Uri.parse("http://cinema.areas.su/movies/14/episodes/trailer.mp4"))
        movie.requestFocus()
        movie.start()


       /* val adapter = Adapter()
        val layoutManager =LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        rv.layoutManager = layoutManager
        rv.adapter = adapter
        getMovieOP()
*/

    }

    fun getMovieOP() {
        val service = Inter.api
        val call = service.getMovie(10)
       // call.enqueue(object :Call<ModelFirst>){

       // }
    }
}