package com.example.wavesoffood

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wavesoffood.databinding.ActivityChooselocationBinding

class ChooselocationActivity : AppCompatActivity() {
    private val binding: ActivityChooselocationBinding by lazy {
        ActivityChooselocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val locatiionList = arrayOf("Barabanki","Gomtinagar","Badshahnagar","Indranagat","Matiyari","Chinhat")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,locatiionList)
        val AutoCompleteTextView : AutoCompleteTextView = binding.listOfLocation
        AutoCompleteTextView.setAdapter(adapter)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}