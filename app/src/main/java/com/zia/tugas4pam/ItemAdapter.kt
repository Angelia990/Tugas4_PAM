package com.zia.tugas4pam

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val itemList: ArrayList<Student>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.tvName)
        val textViewNim: TextView = itemView.findViewById(R.id.tvNim)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val student = itemList[position]
        holder.textViewName.text = student.name
        holder.textViewNim.text = student.nim
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    fun addItem(student: Student) {
        itemList.add(student)
        notifyItemInserted(itemList.size - 1)
    }
}
