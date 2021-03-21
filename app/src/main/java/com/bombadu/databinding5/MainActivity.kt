package com.bombadu.databinding5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.bombadu.databinding5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //Declare Binding after updating and Syncing Build.Gradle (You may need to rebuild)
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Set you content view layout
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.lifecycleOwner = this // You a must have this or else your data won't update

        //Initialize the ViewModel
        val myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        binding.myViewModel = myViewModel

    }
}