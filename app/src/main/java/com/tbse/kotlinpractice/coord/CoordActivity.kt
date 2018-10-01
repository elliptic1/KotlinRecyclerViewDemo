package com.tbse.kotlinpractice.coord

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.tbse.kotlinpractice.R

import kotlinx.android.synthetic.main.activity_coord.*

class CoordActivity : AppCompatActivity() {

    private val strs: ArrayList<String> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coord)
        setSupportActionBar(toolbar)

        addstrs()

        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = MyAdapter(strs.toTypedArray(), this)
    }

    private fun addstrs() {
        strs.add("123")
        strs.add("534qwe")
        strs.add("qwgfe")
        strs.add("24g3rg")
        strs.add("2the4h")
        strs.add("23rgrg")
        strs.add("2berbh")
        strs.add("2ebreb")
        strs.add("2bb3rg")
        strs.add("2eberg")
        strs.add("qsdfgwwe")
        strs.add("qdrgerwe")
        strs.add("5hehtrqwe")
        strs.add("q5regwe")
        strs.add("qhrthwe")
    }

}
