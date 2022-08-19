package com.example.fifa

import Groups
import Matches
import Stadiums
import Titles
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.fifa.AdapterClass.viewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager // creating object of ViewPager
    private lateinit var tab: TabLayout
    // creating object of TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "FIfa World Cup 2022 "

        // set the references of the declared objects above
        pager = findViewById(R.id.viewpager)
        tab = findViewById(R.id.tabview)
        val adapter = viewPagerAdapter(supportFragmentManager)



        // add fragment to the list
        adapter.addFragment(Groups(), "Groups")
        adapter.addFragment(Matches(), "Matches")

//        adapter.addFragment(Teams(), "Teams")
        adapter.addFragment(Titles(), "Champions")

        adapter.addFragment(Stadiums(), "Stadiums")


        // Adding the Adapter to the ViewPager
        pager.adapter = adapter

        // bind the viewPager with the TabLayout.
        tab.setupWithViewPager(pager)


        }


    }

