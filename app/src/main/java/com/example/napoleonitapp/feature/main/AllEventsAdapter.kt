package com.example.napoleonitapp.feature.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.napoleonitapp.R
import com.example.napoleonitapp.data.Event
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.all_events_item.*

class AllEventsAdapter(private  val onEventClick: (Event) -> Unit) : ListAdapter<Event,AllEventsAdapter.ViewHolder>(object : DiffUtil.ItemCallback<Event>(){

    override fun areItemsTheSame(oldItem: Event, newItem: Event): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Event, newItem: Event): Boolean {
        return oldItem == newItem
    }
}) {

    private var curContext: Context ?= null


    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        curContext = parent.context
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.all_events_item, parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = getItem(position)
        holder.tvEventName.text = item.name
        holder.tvEventDate.text = item.date
        Glide.with(curContext!!)
            .load(item?.eventImageView)
            .apply(RequestOptions.circleCropTransform())
            .into(holder.ivEvent)

        holder.containerView.setOnClickListener{
            onEventClick(item)
        }
    }

}