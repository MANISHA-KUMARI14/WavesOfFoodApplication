package com.example.wavesoffood.Adaptar

import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RemoteViews.RemoteCollectionItems
import androidx.recyclerview.widget.RecyclerView
import com.example.wavesoffood.databinding.CarditemBinding

class cartAdapter(private val CartItems:MutableList<String>,private val CartItemPrice:MutableList<String>,private var CartImage: MutableList<Int>) : RecyclerView.Adapter<cartAdapter.CartviewHolder>() {

private val itemQuantities = IntArray(CartItems.size){1}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartviewHolder {
        val binding=CarditemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CartviewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartviewHolder, position: Int) {
        holder.bind(position)
    }
    override fun getItemCount(): Int =CartItems.size
    inner class CartviewHolder(private val binding: CarditemBinding ):RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.apply{
                val quantity = itemQuantities[position]
                cartfoodName.text=CartItems[position]
                cartItemPrice.text=CartItemPrice[position]
                cartImage.setImageResource(CartImage[position])
                cartItemQuantity.text=quantity.toString()
            }
        }

    }
}
