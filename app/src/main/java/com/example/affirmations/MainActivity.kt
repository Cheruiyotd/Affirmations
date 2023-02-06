package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.DataSource
import com.example.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val myDataset = DataSource().loadAffirmations()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val  recycler = binding.recyclerView
        recycler.adapter = ItemAdapter(this, myDataset)
        recycler.setHasFixedSize(true)
   }
}