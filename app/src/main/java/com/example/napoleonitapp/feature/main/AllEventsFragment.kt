package com.example.napoleonitapp.feature.main

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.napoleonitapp.data.Event
import com.example.napoleonitapp.R
import com.example.napoleonitapp.feature.search.SearchFragment
import com.example.napoleonitapp.feature.details.EventDetailsFragment
import com.example.napoleonitapp.feature.elected.ElectedEventsFragment
import kotlinx.android.synthetic.main.fragment_show_events.*
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter

class AllEventsFragment : MvpAppCompatFragment(R.layout.fragment_show_events), AllEventsView {



    private val presenter: AllEventsPresenter by moxyPresenter {
        AllEventsPresenter()
    }

    private var eventsAdapter: AllEventsAdapter ?= null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(rvAllEvents){
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
            adapter = AllEventsAdapter(onEventClick = {
                presenter.onEventClick(it)
            }).also {
                eventsAdapter = it
            }
        }
        initListeners()
    }

    override fun onDestroy() {
        super.onDestroy()
        eventsAdapter = null
    }

    private fun initListeners() {

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

    override fun openEventDetails(event: Event){
        requireFragmentManager().beginTransaction()
            .replace(R.id.container, EventDetailsFragment.newInstance(event))
            .addToBackStack("EventDetailsFragment")
            .commit()
    }

    override fun setEvents(events: List<Event>) {
        eventsAdapter?.submitList(events)
    }
}
