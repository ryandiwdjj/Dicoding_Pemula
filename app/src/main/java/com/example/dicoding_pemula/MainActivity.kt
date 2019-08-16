package com.example.dicoding_pemula

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var rv_univ: RecyclerView
    private lateinit var toolbar: Toolbar
    private lateinit var profile_btn: Button
    private var list: ArrayList<Universitas> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        profile_btn = findViewById(R.id.profile_btn)
        profile_btn.setOnClickListener { View.OnClickListener {

        }}

        rv_univ = findViewById(R.id.rv_univ)
        rv_univ.setHasFixedSize(true)

        list.addAll(UnivData.listData)
        rv_univ.layoutManager = LinearLayoutManager(this)
        rv_univ.adapter = ListUnivAdapter(list)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }
}
