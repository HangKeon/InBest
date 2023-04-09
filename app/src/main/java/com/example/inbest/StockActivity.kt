package com.example.inbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class StockActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stock)

        findViewById<TextView>(R.id.back_btn).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.stock_connection_btn).setOnClickListener {
            val intent = Intent(this, StockConnectionActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}