package com.example.napoleonitapp.features.main

import android.os.Bundle
import android.view.View
import com.example.napoleonitapp.data.Event
import com.example.napoleonitapp.R
import com.example.napoleonitapp.features.search.SearchFragment
import com.example.napoleonitapp.features.details.EventDetailsFragment
import com.example.napoleonitapp.features.elected.ElectedEventsFragment
import kotlinx.android.synthetic.main.fragment_show_events.*
import moxy.MvpAppCompatFragment

class MainFragment : MvpAppCompatFragment(R.layout.fragment_show_events) {

    val event = Event(
        "День рождения ЮУрГУ",
        "20.02.2020",
        "150",
        "https://smartuniversity.susu.ru/media/k2/items/cache/3d853a6ace75c997e3d593aa46517c97_XL.jpg",
        "День рождение ЮУрГУ бывает раз в году."
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
        btnShowDetailsEvent.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, EventDetailsFragment.newInstance(event))
                .addToBackStack("AllEventsFragment")
                .commit()
        }

        btnShowSelectedEvents.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, ElectedEventsFragment())
                .addToBackStack("AllEventsFragment")
                .commit()
        }

        btnExtentFindEvents.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, SearchFragment())
                .addToBackStack("AllEventsFragment")
                .commit()
        }
    }
}