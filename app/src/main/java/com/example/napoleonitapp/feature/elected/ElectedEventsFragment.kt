package com.example.napoleonitapp.feature.elected

import android.os.Bundle
import android.view.View
import com.example.napoleonitapp.R
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter


class ElectedEventsFragment : MvpAppCompatFragment(R.layout.fragment_selected_events), ElectedEventsView {


    val presenter: ElectedEventsPresenter by moxyPresenter {
        ElectedEventsPresenter()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}