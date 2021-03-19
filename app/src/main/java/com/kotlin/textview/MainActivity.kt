package com.kotlin.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // finding the textView
        val textView = findViewById(R.id.text_view_id) as TextView
        //onclick
        textView?.setOnClickListener{ Toast.makeText(this@MainActivity,
            "COMPUTER SCIENCE PORTAL", Toast.LENGTH_LONG).show() }

    }
}