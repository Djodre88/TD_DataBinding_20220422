package com.example.td_databinding_20220422

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.td_databinding_20220422.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(
                    this,
                    R.layout.activity_main)

        val person1 = Person(
            1,
            "Doe",
            "John",
            30)

        binding.person = person1
    }
}