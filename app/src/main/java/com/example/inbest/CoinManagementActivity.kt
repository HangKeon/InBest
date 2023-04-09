package com.example.inbest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class CoinManagementActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin_management)

        findViewById<TextView>(R.id.back_btn).setOnClickListener {
            finish()
        }

        findViewById<TextView>(R.id.add_coin_btn).setOnClickListener {
            val intent = Intent(this, CoinAddActivity::class.java)
            startActivity(intent)
        }

        findViewById<LinearLayout>(R.id.coin_detail_btn).setOnClickListener {
            val intent = Intent(this, StockAddActivity::class.java)
            startActivity(intent)
        }

        findViewById<TextView>(R.id.disconnect_btn).setOnClickListener {
            showSettingPopup()
        }
    }

    private fun showSettingPopup(){
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.disconnect_popup, null)
        val textView = findViewById<TextView>(R.id.popup_text)

        val alertDialog = AlertDialog.Builder(this, R.style.MyDialogTheme)
                //.setTitle("연동해제")
                .setPositiveButton("해제") { dialog, which->
//                    Toast.makeText(this, "연동이 성공적으로 해제되었습니다.",Toast.LENGTH_LONG).show()
                    showSettingPopup2()
                }
                .setNeutralButton("취소", null)
                .create()

        alertDialog.setView(view)
        alertDialog.show()
    }

    private fun showSettingPopup2(){
        val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.disconnect_complete, null)
        val textView = findViewById<TextView>(R.id.popup_text)

        val alertDialog = AlertDialog.Builder(this, R.style.MyDialogTheme)
            //.setTitle("연동해제")
            .setPositiveButton("확인") { dialog, which->
                Toast.makeText(this, "연동이 성공적으로 해제되었습니다.",Toast.LENGTH_LONG).show()

            }
//                .setNeutralButton("취소", null)
            .create()

        alertDialog.setView(view)
        alertDialog.show()
    }
}