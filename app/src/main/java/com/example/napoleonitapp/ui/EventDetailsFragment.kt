package com.example.napoleonitapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.napoleonitapp.EventDataClass
import com.example.napoleonitapp.R
import kotlinx.android.synthetic.main.fragment_event_details.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [EventDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EventDetailsFragment : Fragment(R.layout.fragment_event_details) {

    companion object {
        private var EVENT = "EVENT"

        @JvmStatic
        fun newInstance(event: EventDataClass) =
            EventDetailsFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(EVENT, event)
                }
            }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        arguments?.let {
            val event = it.getParcelable<EventDataClass>(EVENT)

            Glide.with(this)
                .load(event?.eventImageView)
                .apply(RequestOptions.circleCropTransform())
                .into(EventImageView)

            tvName.text = event?.name
            tvDate.text = event?.date
            tvPartCount.text = event?.participantCount
            tvDescription.text = event?.description
        }

    }
}