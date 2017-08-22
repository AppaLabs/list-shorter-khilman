package com.khilman.mylistshorter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
/**
 * Created by root on 22/08/17.
 */
class MainActivity : AppCompatActivity() {
    // data array
    var dataBuah = arrayOf("Jambu Air", "Durian", "Strawberry", "Alpukat", "Apel", "Ceri", "Manggis")

    var dataGambar = arrayOf(R.drawable.jambuair, R.drawable.durian, R.drawable.alpukat, R.drawable.apel, R.drawable.ceri, R.drawable.manggis, R.drawable.strawberry)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // sort data ke ascending
        Arrays.sort(dataBuah)
        //Log.d("Data array", "" + dataBuah.toString())
        var adapter = CustomAdapter(this, dataBuah, dataGambar)
        var linear = LinearLayoutManager(applicationContext)
        recyclerview.adapter = adapter
        recyclerview.layoutManager = linear
    }
}
