package com.example.roslibusiness.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roslibusiness.R
import com.example.roslibusiness.data.model.InventoryItem
import kotlinx.android.synthetic.main.inventory_card.view.*

class LowStockAdapter(private val lowstockList: List<InventoryItem>):
    RecyclerView.Adapter<LowStockAdapter.ViewHolder>() {

    var list : List<InventoryItem> = listOf()

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val namaBarang: TextView = itemView!!.findViewById(R.id.namaStokRV)
        val kuantiti: TextView = itemView!!.findViewById(R.id.kuantitiStokRV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.low_stock_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: LowStockAdapter.ViewHolder, position: Int) {
        holder.namaBarang.text = list.get(position).stock_name
        holder.kuantiti.text = list.get(position).stock_quantity
    }

    override fun getItemCount(): Int = lowstockList.size

    fun setLowStock(list: List<InventoryItem>){
        this.list = list
        notifyDataSetChanged()
    }

}