package com.example.inbest

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment

class MypageActivity : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_mypage, container, false)

        view.findViewById<Button>(R.id.logout_btn).setOnClickListener {
            val intent = Intent(getActivity(), LandingActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }

        view.findViewById<ImageView>(R.id.private_revise_btn).setOnClickListener {
            val intent = Intent(getActivity(), PwdActivity::class.java)
            startActivity(intent)
        }

        view.findViewById<ImageView>(R.id.stock_management_btn).setOnClickListener {
            val intent = Intent(getActivity(), StockManagementActivity::class.java)
            startActivity(intent)
        }

        view.findViewById<ImageView>(R.id.coin_management_btn).setOnClickListener {
            val intent = Intent(getActivity(), CoinManagementActivity::class.java)
            startActivity(intent)
        }

        view.findViewById<ImageView>(R.id.delete_btn).setOnClickListener {
            val intent = Intent(getActivity(), DeleteActivity::class.java)
            startActivity(intent)
        }

        return view
    }
}