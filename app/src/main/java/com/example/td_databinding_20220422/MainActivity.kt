package com.example.td_databinding_20220422

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt
import androidx.lifecycle.ViewModelProvider
import com.example.td_databinding_20220422.databinding.ActivityMainBinding

// => 1er challenge : Two ways data binding. Regarder la doc
// OBJECTIF :   ajouter un slider (SeekBar) qui permet de modifier la valeur de l'âge
//              et va mettre à jour l'observable ou le ViewModel
//              et donc va afficher la valeur de l'âge modifié

// => 2e challenge : pour la correction d'hier, jeudi 21 avril (deux dés) : le refaire avec un ViewModelScope
// OBJECTIF :   1- Ajouter la dépendance pour le ViewModelScope
//              2- Dans le ViewModel, créer un MutableLiveData avec l'index du dé, sa valeur
//              3- Dans un ViewModelScope créer la coroutine qui va calculer la valeur du dé
//                  et qui va permettre pendant deux secondes de calculer 20 valeurs avant que le dé ne se stabilise
//              4- Dans la MainActivity créer un Observer qui va permettre d'afficher les dés

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
