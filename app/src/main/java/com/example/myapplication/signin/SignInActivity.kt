package com.example.myapplication.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.signup.SignaUpActivity
import com.example.myapplication.main.MainActivity
import kotlinx.android.synthetic.main.activity_signa_up.*

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val service = 
    }

    fun voiti(view: View) {
        var isChar = false
        for (char in edit_email.toString()) {
            if (edit_email.toString().equals("@")) {
                isChar = true
            }
        }
        if (!isChar || edit_email.toString().isEmpty() || edit_pas.toString().isEmpty()) {
            Toast.makeText(this, "Ваши данные введены неверно, либо не введены!", Toast.LENGTH_SHORT).show()
        } else {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    fun reg(view: View) {
        val intent = Intent(this, SignaUpActivity::class.java)
        startActivity(intent)
    }
}