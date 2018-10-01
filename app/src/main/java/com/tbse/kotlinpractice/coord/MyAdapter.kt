package com.tbse.kotlinpractice.coord

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tbse.kotlinpractice.R
import kotlinx.android.synthetic.main.item_layout.view.*

/**
 * Created by toddsmith on 9/27/18.
 * Copyright TBSE 2017
 */

class MyAdapter(private val dataset: Array<String>, val context: Context) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tv.text = "$position - ${dataset[position]}"
    }

}

class MyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
    val tv = view.tv!!
}