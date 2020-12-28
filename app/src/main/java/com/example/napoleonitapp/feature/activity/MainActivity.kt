package com.example.napoleonitapp.feature.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.napoleonitapp.R
import com.example.napoleonitapp.feature.allEvents.AllEventsFragment

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager

        fragmentManager.beginTransaction()
            .add(R.id.container, AllEventsFragment())
            .commit()

    }

}