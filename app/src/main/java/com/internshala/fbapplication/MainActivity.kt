package com.internshala.fbapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btnCreateAccount : Button = findViewById(R.id.btnCreateAccount)
        btnCreateAccount.setOnClickListener {
           val intent = Intent(this@MainActivity,RegisterActivity ::class.java)
            startActivity(intent)
        }

    }

}