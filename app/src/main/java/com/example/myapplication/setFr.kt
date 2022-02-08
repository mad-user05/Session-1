package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun setFragment(activity: AppCompatActivity, frame : Int, fragment : Fragment) {
    val tr = activity.supportFragmentManager.beginTransaction()
    tr.replace(frame, fragment)
    tr.commit()
}