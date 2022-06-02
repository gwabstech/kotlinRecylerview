package com.gwabs.kotlinrecylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gwabs.kotlinrecylerview.adapter.ItemAdapter
import com.gwabs.kotlinrecylerview.data.Datasource
import com.gwabs.kotlinrecylerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // creating a binding variavle
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // assigning the binding object to the variable
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        val myDataset = Datasource().loadAffirmations()
        binding.rv.adapter = ItemAdapter(this,myDataset)
        binding.rv.hasFixedSize()
        setContentView(view)
    }
}