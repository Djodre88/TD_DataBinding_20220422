package com.example.td_databinding_20220422

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModelProvider
import com.example.td_databinding_20220422.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val observablePerson = ObservablePerson(
        ObservableInt(30),
        ObservableField<String>("DOE"),
        ObservableField<String>("John"),
        ObservableInt(35)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(
                    this,
                    R.layout.activity_main)

//        val person1 = Person(
//            1,
//            "Doe",
//            "John",
//            30)
//
//        binding.person = person1

//        binding.person = observablePerson

        val viewModel = ViewModelProvider(this).get(PersonViewModel::class.java)
        binding.person = viewModel
        binding.lifecycleOwner = this

    }
}
