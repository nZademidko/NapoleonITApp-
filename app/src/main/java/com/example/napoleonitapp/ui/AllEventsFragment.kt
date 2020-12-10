package com.example.napoleonitapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.napoleonitapp.EventDataClass
import com.example.napoleonitapp.R
import kotlinx.android.synthetic.main.fragment_show_events.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ShowEventsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ShowEventsFragment : Fragment(R.layout.fragment_show_events) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val event = EventDataClass("День рождения ЮУрГУ", "20.02.2020","150",
            "https://smartuniversity.susu.ru/media/k2/items/cache/3d853a6ace75c997e3d593aa46517c97_XL.jpg", "День рождение ЮУрГУ бывает раз в году.")

        btnShowDetailsEvent.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container,EventDetailsFragment.newInstance(event))
                .addToBackStack("AllEventsFragment")
                .commit()
        }

        btnShowSelectedEvents.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container,SelectedEventsFragment())
                .addToBackStack("AllEventsFragment")
                .commit()
        }

        btnExtentFindEvents.setOnClickListener {
            requireFragmentManager().beginTransaction()
                .replace(R.id.container,ExtendFindFragment())
                .addToBackStack("AllEventsFragment")
                .commit()
        }
    }

}