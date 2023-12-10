package com.example.gta5rplaws

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StatjaAdapter(var mList: List<StatjaData>) :
    RecyclerView.Adapter<StatjaAdapter.StatjaViewHolder>() {

    inner class StatjaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val statjaText : TextView = itemView.findViewById(R.id.statjaText)
        val statjaNumber : TextView = itemView.findViewById(R.id.statjaNB)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatjaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return StatjaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: StatjaViewHolder, position: Int) {
        holder.statjaNumber.text = mList[position].statjaNumber.toString()
        holder.statjaText.text = mList[position].statjaText
    }

}