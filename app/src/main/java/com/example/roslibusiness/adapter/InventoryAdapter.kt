package com.example.roslibusiness.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.roslibusiness.data.model.InventoryItem
import kotlinx.android.synthetic.main.inventory_card.view.*

class InventoryAdapter (private val inventoryList: InventoryItem):
    RecyclerView.Adapter<InventoryAdapter.ViewHolder>() {

    class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){

        fun bindRepo(repo:InventoryItem){
            itemView.namaStokRV.text = repo.stock_name.orEmpty()
            itemView.kategoriStokRV.text = repo.category_name.orEmpty()
            itemView.hargaStokRV.text = repo.stock_price.orEmpty()
            itemView.kuantitiStokRV.text = repo.stock_quantity.orEmpty()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InventoryAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: InventoryAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}