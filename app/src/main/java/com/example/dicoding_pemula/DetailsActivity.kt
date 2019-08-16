package com.example.dicoding_pemula

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NavUtils
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        Glide.with(applicationContext)
            .load(intent.getStringExtra("univ_photo"))
            .apply(RequestOptions())
            .into(findViewById(R.id.photo_img))

        findViewById<TextView>(R.id.name_txt).text = intent.getStringExtra("univ_name")

        findViewById<TextView>(R.id.details_txt).text = intent.getStringExtra("univ_details")

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(intent.getStringExtra("univ_name"))
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.home) {
            NavUtils.navigateUpFromSameTask(this)
            return true
        } else {
            return super.onOptionsItemSelected(item)
        }
    }
}
