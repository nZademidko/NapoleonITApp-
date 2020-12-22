package com.example.napoleonitapp.feature.detailEvents

import android.content.Context
import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.napoleonitapp.data.dataClass.Event
import com.example.napoleonitapp.R
import com.example.napoleonitapp.data.ElectedDaoImpl
import kotlinx.android.synthetic.main.fragment_event_details.*
import moxy.MvpAppCompatFragment
import moxy.ktx.moxyPresenter


class EventDetailsFragment : MvpAppCompatFragment(R.layout.fragment_event_details),
    EventDetailsView {

    companion object {
        private var EVENT = "EVENT"

        @JvmStatic
        fun newInstance(event: Event) =
            EventDetailsFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(EVENT, event)
                }
            }

    }

    private val presenter: EventDetailsPresenter by moxyPresenter {
        EventDetailsPresenter(
            event = arguments?.getParcelable<Event>(EVENT)!!,
            electedDao = ElectedDaoImpl(requireContext().getSharedPreferences("data",Context.MODE_PRIVATE))
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ivElected.setOnClickListener {
            presenter.onElectedClicked()
        }
    }

    override fun setEvent(event: Event) {
        Glide.with(this)
            .load(event.eventImageView)
            .apply(RequestOptions.circleCropTransform())
            .into(EventImageView)

        tvName.text = event.name
        tvDate.text = event.date
        tvPartCount.text = event.participantCount
        tvDescription.text = event.description

    }

    override fun setIsInElected(isInElected: Boolean) {
        ivElected.setImageResource(
            if(isInElected) R.drawable.ic_iv_favorite else R.drawable.ic_iv_unfavorite
        )
    }
}