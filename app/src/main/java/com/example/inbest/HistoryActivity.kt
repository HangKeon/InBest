package com.example.inbest

import android.app.Activity
import android.app.DatePickerDialog
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class HistoryActivity : Fragment() {

    var items = arrayOf("전체", "Upbit", "대신증권")
    var items2 = arrayOf("전체", "삼성전자", "KWR", "BTC")
    val DataList = arrayListOf(
            Data(R.drawable.sell_icon, "BTC", "2021/09/21", "58,189,000", "5.46", "Upbit", "0.00018787", "10,931", "10,926"),
            Data(R.drawable.deposit, "KWR", "2021/09/17", "0", "0", "Upbit", "200,000", "200,000", "200,000"),
            Data(R.drawable.buy_icon, "삼성전자", "2021/09/14", "73,200", "0", "대신증권", "10", "73,200", "73,200"),
            Data(R.drawable.withdraw_icon, "KWR", "2021/09/10", "0", "0", "Upbit", "50,000", "50,000", "50,000")
    )

    var dateString = ""

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.activity_history, container, false)

        view.findViewById<Button>(R.id.start_date).setOnClickListener {
            val cal = Calendar.getInstance()    //캘린더뷰 만들기
            val dateSetListener = DatePickerDialog.OnDateSetListener { view2, year, month, dayOfMonth ->
                dateString = "${year}년 ${month+1}월 ${dayOfMonth}일"
                view.findViewById<Button>(R.id.start_date)?.text = dateString
            }
            DatePickerDialog(requireContext(), dateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
        }

        view.findViewById<Button>(R.id.end_date).setOnClickListener {
            val cal = Calendar.getInstance()    //캘린더뷰 만들기
            val dateSetListener = DatePickerDialog.OnDateSetListener { view2, year, month, dayOfMonth ->
                dateString = "${year}년 ${month+1}월 ${dayOfMonth}일"
                view.findViewById<Button>(R.id.end_date)?.text = dateString
            }
            DatePickerDialog(requireContext(), dateSetListener, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
        }





/////////////////////////////////////////////////////////////////////////////////////////////////////////////


        val myAdapter = ArrayAdapter(requireContext(), R.layout.spinner_item, items)
        view.findViewById<Spinner>(R.id.spinner1).adapter = myAdapter
        view.findViewById<Spinner>(R.id.spinner1).onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
               // println(items[p2])
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        val myAdapter2 = ArrayAdapter(requireContext(), R.layout.spinner_item, items2)
        view.findViewById<Spinner>(R.id.spinner2).adapter = myAdapter2
        view.findViewById<Spinner>(R.id.spinner2).onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                //println(items2[p2])
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }

        view.findViewById<RecyclerView>(R.id.recyclerView).layoutManager = LinearLayoutManager(getActivity())
        view.findViewById<RecyclerView>(R.id.recyclerView).adapter = CustomAdapter(DataList)


        view.findViewById<RadioGroup>(R.id.RadioGroup).check(R.id.totalRadioButton)

        view.findViewById<Button>(R.id.show_btn).setOnClickListener {
            view.findViewById<RecyclerView>(R.id.recyclerView).isVisible = true
        }

        return view
    }

}







    /*(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)

//        findViewById<TextView>(R.id.back_btn).setOnClickListener {
//            finish()
//        }

        findViewById<RadioGroup>(R.id.RadioGroup).check(R.id.totalRadioButton)

    }
}*/