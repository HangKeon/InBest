package com.example.inbest

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.motion.utils.Easing
import androidx.fragment.app.Fragment
import com.github.mikephil.charting.animation.Easing.EaseInOutQuad
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate

class RecommendActivity : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_recommend, container,false)

        /*view.findViewById<TextView>(R.id.add_stock_btn).setOnClickListener{
            val intent = Intent(getActivity(), StockAddActivity::class.java)
            startActivity(intent)
        }*/

        val now_chart = view.findViewById<com.github.mikephil.charting.charts.PieChart>(R.id.now_chart)
        now_chart.setUsePercentValues(true)

        //data set
        val entries = ArrayList<PieEntry>()
        entries.add(PieEntry(73200f,"국내주식"))
        entries.add(PieEntry(0f,"해외주식"))
        entries.add(PieEntry(10926f,"코인"))
        entries.add(PieEntry(65869f,"현금"))

        //color
        val colorsItems = ArrayList<Int>()

        for(c in ColorTemplate.VORDIPLOM_COLORS)
            colorsItems.add((c))

        for(c in ColorTemplate.JOYFUL_COLORS)
            colorsItems.add((c))

        for(c in ColorTemplate.LIBERTY_COLORS)
            colorsItems.add((c))

        for(c in ColorTemplate.PASTEL_COLORS)
            colorsItems.add((c))

        colorsItems.add(ColorTemplate.getHoloBlue())


        //percentage and color and size
        val pieDataSet = PieDataSet(entries,"")
        pieDataSet.apply {
            colors = colorsItems
            valueTextColor = Color.BLACK
            valueTextSize = 16f
        }

        val pieDate = PieData(pieDataSet)
        now_chart.apply {
            data = pieDate
            description.isEnabled = false
            isRotationEnabled = false
            setEntryLabelColor(Color.BLACK)
            //animateY(1400, Easing.Ease)
           // animate()
        }

////////////////////////////////////////////////////////////////////////////


        val predict_chart = view.findViewById<com.github.mikephil.charting.charts.PieChart>(R.id.predict_chart)
        predict_chart.setUsePercentValues(true)

        //data set
        val entries2 = ArrayList<PieEntry>()
        entries2.add(PieEntry(36f,"국내주식"))
        entries2.add(PieEntry(0f,"해외주식"))
        entries2.add(PieEntry(25f,"코인"))
        entries2.add(PieEntry(17f,"현금"))

        //color
        val colorsItems2 = ArrayList<Int>()

        for(c2 in ColorTemplate.VORDIPLOM_COLORS)
            colorsItems2.add((c2))

        for(c2 in ColorTemplate.JOYFUL_COLORS)
            colorsItems2.add((c2))

        for(c2 in ColorTemplate.LIBERTY_COLORS)
            colorsItems2.add((c2))

        for(c2 in ColorTemplate.PASTEL_COLORS)
            colorsItems2.add((c2))

        colorsItems2.add(ColorTemplate.getHoloBlue())


        //percentage and color and size
        val pieDataSet2 = PieDataSet(entries2,"")
        pieDataSet2.apply {
            colors = colorsItems2
            valueTextColor = Color.BLACK
            valueTextSize = 16f
        }

        val pieDate2 = PieData(pieDataSet2)
        predict_chart.apply {
            data = pieDate2
            description.isEnabled = false
            isRotationEnabled = false
            setEntryLabelColor(Color.BLACK)
            //animateY(1400, Easing.Ease)
            // animate()
        }

        return view
    }
}