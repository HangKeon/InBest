package com.example.inbest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onNavigationItemSelected()
    }

    fun onNavigationItemSelected() {
        findViewById<BottomNavigationView>(R.id.bottomNavigationView).run{
            setOnItemSelectedListener {item ->
                when(item.itemId) {
                    R.id.balance -> {
                        supportFragmentManager.beginTransaction().replace(R.id.linearLayout , PortfolioActivity()).commit()
//                        val intent = Intent(this@MainActivity, StockAddActivity::class.java)
//                        startActivity(intent)
                    }
                    R.id.history -> {
                        supportFragmentManager.beginTransaction().replace(R.id.linearLayout, HistoryActivity()).commit()
                    }
                    R.id.chart -> {
                        supportFragmentManager.beginTransaction().replace(R.id.linearLayout, RecommendActivity()).commit()
                    }
                    R.id.mypage -> {
                        supportFragmentManager.beginTransaction().replace(R.id.linearLayout, MypageActivity()).commit()
                    }
                }
                true
            }

        }
        findViewById<BottomNavigationView>(R.id.bottomNavigationView).selectedItemId = R.id.balance
    }
}


/*
class Fragment1:Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    )= inflater.inflate(R.layout.activity_portfolio,container,false)
}

class Fragment2:Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    )= inflater.inflate(R.layout.activity_history,container,false)
}

class Fragment3:Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    )= inflater.inflate(R.layout.activity_recommend,container,false)
}

class Fragment4:Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    )= inflater.inflate(R.layout.activity_mypage,container,false)
}*/
