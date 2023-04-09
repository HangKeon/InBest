package com.example.inbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class JoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        findViewById<TextView>(R.id.back_btn).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.complete_btn).setOnClickListener{
            val intent = Intent(this, JoinFinishActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}