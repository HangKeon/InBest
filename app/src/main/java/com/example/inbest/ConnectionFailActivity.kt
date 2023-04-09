package com.example.inbest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConnectionFailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connection_fail)

        findViewById<Button>(R.id.back_btn).setOnClickListener {
            finish()
        }
    }
}