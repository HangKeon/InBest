package com.example.inbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class LoginActivity : AppCompatActivity() {

    //val email = findViewById<EditText>(R.id.email)
    //val pwd = findViewById<EditText>(R.id.pwd)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.login_btn).setOnClickListener { v ->
            Login(v)
        }

        findViewById<TextView>(R.id.make_login_btn).setOnClickListener {
            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
        }
    }

    fun Login(v: View){
        if((findViewById<EditText>(R.id.email).text.toString() == "sy1234" || findViewById<EditText>(R.id.email).text.toString() == "sy1234@naver.com")
                && findViewById<EditText>(R.id.pwd).text.toString() == "123456789") {

            Toast.makeText(this, "로그인이 성공했습니다.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        else {
            findViewById<EditText>(R.id.email).setText("")
            findViewById<EditText>(R.id.pwd).setText("")

            Toast.makeText(this, "로그인이 실패했습니다.", Toast.LENGTH_SHORT).show()
        }

    }
}