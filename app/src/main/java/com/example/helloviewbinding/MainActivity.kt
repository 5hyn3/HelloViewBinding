package com.example.helloviewbinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.helloviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        binding.textView.text = "Hello View Binding!"
    }
}
