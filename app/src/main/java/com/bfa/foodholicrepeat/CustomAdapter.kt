package com.bfa.foodholicrepeat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class CustomAdapter(val foodImg: Array<Int>, val foodNm: Array<String>, val foodDs: Array<String>):
    RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {
    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        fun bindView(foodImg: Int, foodNm: String, foodDs: String){
            itemView.foodImage.setImageResource(foodImg)
            itemView.foodName.text = foodNm
            itemView.foodDes.text = foodDs
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(v)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        holder.bindView(foodImg[position], foodNm[position], foodDs[position])
    }

    override fun getItemCount(): Int {
        return (foodImg.size)
    }
}