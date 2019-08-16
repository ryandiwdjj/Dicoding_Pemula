package com.example.dicoding_pemula

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var rv_univ: RecyclerView
    private lateinit var toolbar: Toolbar
    private lateinit var profile_btn: ImageView
    private var list: ArrayList<Universitas> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_univ = findViewById(R.id.rv_univ)
        rv_univ.setHasFixedSize(true)

        supportActionBar?.setTitle("Universitas Swasta")

        list.addAll(UnivData.listData)
        rv_univ.layoutManager = LinearLayoutManager(this)
        val listUnivAdapter = ListUnivAdapter(list)
        rv_univ.adapter = listUnivAdapter

        listUnivAdapter.setOnItemClickCallback(object : ListUnivAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Universitas) {
                var i: Intent = Intent(applicationContext, DetailsActivity::class.java)
                i.putExtra("univ_name", data.name)
                i.putExtra("univ_details", data.details)
                i.putExtra("univ_photo", data.photo)

                startActivity(i)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        var id: Int = item!!.itemId

        if(id == R.id.about_btn) {
            startActivity(Intent(this, AboutActivity::class.java))
            return true
        }

        else {
            return super.onOptionsItemSelected(item)
        }
    }
}
