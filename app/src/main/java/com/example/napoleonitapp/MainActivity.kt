package com.example.napoleonitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.napoleonitapp.features.main.MainFragment

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager

        fragmentManager.beginTransaction()
            .add(R.id.container, MainFragment())
            .commit()

    }

}