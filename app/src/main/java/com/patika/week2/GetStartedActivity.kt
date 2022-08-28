package com.patika.week2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.patika.week2.databinding.ActivityGetstartedBinding

class GetStartedActivity : AppCompatActivity() {

    private lateinit var  binding:ActivityGetstartedBinding
    private lateinit var myIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding =  ActivityGetstartedBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myIntent = Intent(this,MainActivity::class.java)
        //binding = DataBindingUtil.setContentView(this,R.layout.activity_getstarted)
        binding.getstartedButton.setOnClickListener {
           startActivity(myIntent)
        }
    }
}