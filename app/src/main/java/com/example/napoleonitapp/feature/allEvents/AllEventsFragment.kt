package com.example.napoleonitapp.feature.allEvents

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.napoleonitapp.data.dataClass.Event
import com.example.napoleonitapp.R
import com.example.napoleonitapp.data.ElectedDaoImpl
import com.example.napoleonitapp.data.dataClass.SettingsEvent
import com.example.napoleonitapp.di.eventApi
import com.example.napoleonitapp.domain.GetEventsUseCase
import com.example.napoleonitapp.feature.detailEvents.EventDetailsFragment
import com.example.napoleonitapp.data.dataClass.RbTYPE
import com.example.napoleonitapp.feature.allEvents.adapter.AllEventsAdapter
import com.example.napoleonitapp.feature.allEvents.presenter.AllEventsPresenter
import com.example.napoleonitapp.feature.allEvents.presenter.AllEventsView
import kotlinx.android.synthetic.main.find_event_dialog.view.*
import kotlinx.android.synthetic.main.fragment_all_events.*
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter

class AllEventsFragment : MvpAppCompatFragment(R.layout.fragment_all_events), AllEventsView {


    private val presenter: AllEventsPresenter by moxyPresenter {
        AllEventsPresenter(
            electedDao = ElectedDaoImpl(
                requireContext().getSharedPreferences(
                    "data",
                    Context.MODE_PRIVATE
                )
            ),
            getEventsUseCase = GetEventsUseCase(eventApi = eventApi)
        )
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
            presenter.onExtentFindClicked()
        }
    }


    override fun openDetailEvent(event: Event) {
        requireFragmentManager().beginTransaction()
            .replace(R.id.container, EventDetailsFragment.newInstance(event))
            .addToBackStack("EventDetailsFragment")
            .commit()
    }

    override fun showLoading(isShow: Boolean) {
        pbEvents.isVisible = isShow
    }

    override fun setFindDialog(settingsEvent: SettingsEvent) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(requireContext())
        val dialogView = layoutInflater.inflate(R.layout.find_event_dialog, null)
        val dialog: AlertDialog = builder.create()

        dialogView.etCountFrom.setText(settingsEvent.countFromText)
        dialogView.etCountTo.setText(settingsEvent.countToText)
        when (settingsEvent.rbTYPE) {
            RbTYPE.NEWER -> dialogView.rgSearch.check(dialogView.rbNewer.id)
            RbTYPE.OLDER -> dialogView.rgSearch.check(dialogView.rbOlder.id)
            else -> dialogView.rgSearch.check(dialogView.rbRandom.id)
        }


        var curRbTYPE: RbTYPE = settingsEvent.rbTYPE
        with(dialog) {
            dialogView.rgSearch.setOnCheckedChangeListener { radioGroup, checkedId ->

                val selectedType = when (checkedId) {

                    R.id.rbNewer -> RbTYPE.NEWER
                    R.id.rbOlder -> RbTYPE.OLDER
                    else -> RbTYPE.ALL
                }
                curRbTYPE = selectedType
            }

            dialogView.btnSearch.setOnClickListener {
                if (dialogView.etCountFrom.text.toString()
                        .toInt() > dialogView.etCountTo.text.toString().toInt()
                ) {
                    Toast.makeText(requireContext(), "Неправильный ввод данных", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    presenter.applyEvents(
                        SettingsEvent(
                            dialogView.etCountFrom.text.toString(),
                            dialogView.etCountTo.text.toString(),
                            rbTYPE = curRbTYPE
                        )
                    )
                    dialog.cancel()
                }
            }
            setView(dialogView)
            show()
        }
    }


    override fun setEvents(events: List<Event>) {
        eventsAdapter?.submitList(events)
    }
}
