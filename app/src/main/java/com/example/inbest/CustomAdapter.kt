package com.example.inbest;

import android.view.LayoutInflater
import android.view.View;
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Data(val profile : Int, val name : String, val date : String, val price1 : String, val fee : String, val loca : String, val cnt : String, val price2 : String, val price3 : String)

class CustomViewHolder(v : View) : RecyclerView.ViewHolder(v){
    val profile = v.findViewById<ImageView>(R.id.profile)
    val name = v.findViewById<TextView>(R.id.name)
    val date = v.findViewById<TextView>(R.id.date)
    val price1 = v.findViewById<TextView>(R.id.price1)
    val fee = v.findViewById<TextView>(R.id.fee)
    val loca = v.findViewById<TextView>(R.id.loca)
    val cnt = v.findViewById<TextView>(R.id.cnt)
    val price2 = v.findViewById<TextView>(R.id.price2)
    val price3 = v.findViewById<TextView>(R.id.price3)
}

class CustomAdapter(val DataList: ArrayList<Data>) : RecyclerView.Adapter<CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val cellForRow = LayoutInflater.from(parent.context).inflate(R.layout.custom_list, parent, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.profile.setImageResource(DataList[position].profile)
        holder.name.text = DataList[position].name
        holder.date.text = DataList[position].date
        holder.price1.text = DataList[position].price1
        holder.fee.text = DataList[position].fee
        holder.loca.text = DataList[position].loca
        holder.cnt.text = DataList[position].cnt
        holder.price2.text = DataList[position].price2
        holder.price3.text = DataList[position].price3
    }

    override fun getItemCount() = DataList.size

}

