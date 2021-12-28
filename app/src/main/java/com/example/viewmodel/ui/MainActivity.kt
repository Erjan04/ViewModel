package com.example.viewmodel.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding
import com.example.viewmodel.ui.adapters.ViewAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ViewAdapter
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        adapter = ViewAdapter(this)
        binding.viewPager.adapter = adapter
    }
}