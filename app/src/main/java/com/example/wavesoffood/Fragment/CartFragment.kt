package com.example.wavesoffood.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.Adaptar.cartAdapter
import com.example.wavesoffood.R
import com.example.wavesoffood.databinding.FragmentCartBinding
import com.example.wavesoffood.databinding.FragmentHomeBinding


class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCartBinding.inflate(inflater,container,false)

        val cartFoodName = listOf("Pizza","Biryani","Sandwich","Southindian","Item")
        val cartItemPrice = listOf("Rs 90","Rs 100","40","50","150")
        val cartImage = listOf(
            R.drawable.pizza,
            R.drawable.biryani,
            R.drawable.sandwich,
            R.drawable.southindian,
            R.drawable.buffet
        )
        val adapter = cartAdapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cardrecyclerview.layoutManager = LinearLayoutManager(requireContext())
        binding.cardrecyclerview.adapter = adapter
        return binding.root
    }

    companion object {

            }
    }
