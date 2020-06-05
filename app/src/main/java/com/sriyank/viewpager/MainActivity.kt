package com.sriyank.viewpager

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupCustomSpinner()
    }

    fun setupCustomSpinner() {

        val adapter = CountryArrayAdapter(this, Countries.list!!)
        customSpinner.adapter = adapter
    }

}
