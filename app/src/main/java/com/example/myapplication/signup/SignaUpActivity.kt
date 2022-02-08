package com.example.myapplication.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.main.MainActivity
import com.example.myapplication.signin.SignInActivity
import kotlinx.android.synthetic.main.activity_signa_up.*

class SignaUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signa_up)

    }

    fun reg(view: View) {
        var isChar = false
        for (char in edit_email.toString()) {
            if (edit_email.toString().equals("@")) {
                isChar = true
            }
        }
        if (!isChar || edit_name.toString().isEmpty() || edit_secmname.toString()
                .isEmpty() || edit_email.toString().isEmpty() || edit_pas.toString()
                .isEmpty() || edit_pas2.toString().isEmpty()
        ){
            Toast.makeText(this, "Ваши данные введены неверно, либо не введены!", Toast.LENGTH_SHORT).show()
        }
        else {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    fun akc(view: View) {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}