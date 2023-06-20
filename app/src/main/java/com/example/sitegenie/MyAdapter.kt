package com.example.sitegenie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MyAdapter(private val userlist:ArrayList<User>): RecyclerView.Adapter<MyAdapter.MyViewHolder>()

{

    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)
    {
        val vSub:TextView = itemView.findViewById(R.id.subject)
        val vlocation:TextView = itemView.findViewById(R.id.location)
        val cnumber:TextView = itemView.findViewById(R.id.cnumber)
        val vstatus:TextView = itemView.findViewById(R.id.status)
        val vmile:TextView = itemView.findViewById(R.id.milestone)
        val vrequest:TextView  =itemView.findViewById(R.id.request)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder
    {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.vSub.text = userlist[position].subject
        holder.vlocation.text = userlist[position].location
        holder.cnumber.text = userlist[position].contact_number
        holder.vstatus.text = userlist[position].current_project_status
        holder.vmile.text = userlist[position].milestone
        holder.vrequest.text = userlist[position].request_made

    }

    override fun getItemCount(): Int {
        return userlist.size
    }

}