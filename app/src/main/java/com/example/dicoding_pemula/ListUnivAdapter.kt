package com.example.dicoding_pemula

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListUnivAdapter(val listUniv: ArrayList<Universitas>) : RecyclerView.Adapter<ListUnivAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_laptop, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listUniv.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, details, photo) = listUniv[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.photo_img)
        holder.name_txt.text = name
        holder.details_txt.text = details
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name_txt: TextView = itemView.findViewById(R.id.name_txt)
        var details_txt: TextView = itemView.findViewById(R.id.details_txt)
        var photo_img: ImageView = itemView.findViewById(R.id.photo_img)
    }
}