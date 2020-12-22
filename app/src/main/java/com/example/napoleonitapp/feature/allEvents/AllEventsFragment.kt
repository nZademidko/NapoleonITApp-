package com.example.napoleonitapp.feature.allEvents

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.napoleonitapp.data.dataClass.Event
import com.example.napoleonitapp.R
import com.example.napoleonitapp.data.ElectedDaoImpl
import com.example.napoleonitapp.feature.searchEvents.SearchFragment
import com.example.napoleonitapp.feature.detailEvents.EventDetailsFragment
import kotlinx.android.synthetic.main.fragment_all_events.*
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter

class AllEventsFragment : MvpAppCompatFragment(R.layout.fragment_all_events), AllEventsView {


    private val presenter: AllEventsPresenter by moxyPresenter {
        AllEventsPresenter(electedDao = ElectedDaoImpl(requireContext().getSharedPreferences("data",Context.MODE_PRIVATE)))
    }

    private var eventsAdapter: AllEventsAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(rvAllEvents) {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = AllEventsAdapter(onEventClick = {
                presenter.onDetailEventClicked(it)
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

        swElectedEvents.setOnCheckedChangeListener { compoundButton, isChecked ->
            presenter.onElectedEventsSwitched(isChecked)
        }



        btnExtentFindEvents.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container, SearchFragment())
                .addToBackStack("AllEventsFragment")
                .commit()
        }
    }

    override fun openDetailEvent(event: Event) {
        requireFragmentManager().beginTransaction()
            .replace(R.id.container, EventDetailsFragment.newInstance(event))
            .addToBackStack("EventDetailsFragment")
            .commit()
    }


    override fun setEvents(events: List<Event>) {
        eventsAdapter?.submitList(events)
    }
}
