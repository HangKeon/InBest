package com.example.inbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class CoinAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_add)

        findViewById<TextView>(R.id.back_btn).setOnClickListener {
            finish()
        }

        findViewById<ImageView>(R.id.coin_connection_btn).setOnClickListener {
            val intent = Intent(this, CoinConnectionActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}