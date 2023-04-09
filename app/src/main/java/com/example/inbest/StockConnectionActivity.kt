package com.example.inbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class StockConnectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stock_connection)

        findViewById<TextView>(R.id.back_btn).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.success_fail_btn).setOnClickListener { v->
            Connection(v)
        }
    }

    fun Connection(v: View){
        if((findViewById<EditText>(R.id.email).text.toString() == "sy1234" || findViewById<EditText>(R.id.email).text.toString() == "sy1234@naver.com")
                && findViewById<EditText>(R.id.pwd).text.toString() == "123456789") {

            val intent = Intent(this, ConnectionSuccessActivity::class.java)
            startActivity(intent)
            finish()
        }
        else {
            val intent = Intent(this, ConnectionFailActivity::class.java)
            startActivity(intent)
            finish()
        }

        findViewById<EditText>(R.id.email).setText("")
        findViewById<EditText>(R.id.pwd).setText("")
    }
}