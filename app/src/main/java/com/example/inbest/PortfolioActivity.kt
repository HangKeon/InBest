package com.example.inbest

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment

var swt = 0
var swt2 = 0

class PortfolioActivity : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_portfolio,container,false)

        view.findViewById<TextView>(R.id.add_stock_btn).setOnClickListener{
            val intent = Intent(getActivity(), StockAddActivity::class.java)
            swt=1
            startActivity(intent)
            //activity?.finish()
        }

        view.findViewById<ImageView>(R.id.stock_detail_btn).setOnClickListener {
            val intent = Intent(getActivity(), StockActivity::class.java)
            startActivity(intent)
        }

        view.findViewById<TextView>(R.id.add_coin_btn).setOnClickListener {
            val intent = Intent(getActivity(), CoinAddActivity::class.java)
            swt2 = 2
            startActivity(intent)
            //activity?.finish()
        }

        view.findViewById<ImageView>(R.id.coin_detail_btn).setOnClickListener {
            val intent = Intent(getActivity(), CoinActivity::class.java)
            startActivity(intent)
        }

        if(swt == 1){
            view.findViewById<FrameLayout>(R.id.stock_frame).isVisible = true
            view.findViewById<TextView>(R.id.total_price).text = "73,200 KRW"

        }
        if(swt2 == 2){
            view.findViewById<FrameLayout>(R.id.coin_frame).isVisible = true
            view.findViewById<TextView>(R.id.total_price).text = "84,126 KRW"
        }

        return view
    }



    /* (savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_portfolio)

         findViewById<TextView>(R.id.add_stock_btn).setOnClickListener {
             val intent = Intent(this, StockAddActivity::class.java)
             startActivity(intent)
         }

         findViewById<ImageView>(R.id.stock_detail_btn).setOnClickListener {
             val intent = Intent(this, StockActivity::class.java)
             startActivity(intent)
         }

         findViewById<TextView>(R.id.add_coin_btn).setOnClickListener {
             val intent = Intent(this, CoinAddActivity::class.java)
             startActivity(intent)
         }

         findViewById<ImageView>(R.id.coin_detail_btn).setOnClickListener {
             val intent = Intent(this, CoinActivity::class.java)
             startActivity(intent)
         }
     }*/
}