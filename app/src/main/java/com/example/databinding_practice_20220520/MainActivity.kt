package com.example.databinding_practice_20220520

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databinding_practice_20220520.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }

    fun setupEvent(){
        binding.btnClick.setOnClickListener {
            val inputEmail = binding.edtId.text.toString()
            val inputPw = binding.edtPw.text.toString()
        }
    }
}