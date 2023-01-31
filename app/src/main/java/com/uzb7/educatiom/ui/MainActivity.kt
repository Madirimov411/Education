package com.uzb7.educatiom.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uzb7.educatiom.R
import com.uzb7.educatiom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        binding.apply {
            kurslar.setOnClickListener{
                val i=Intent(this@MainActivity,KurslarActivity::class.java)
                startActivity(i)
            }
            guruhlar.setOnClickListener{
                val i=Intent(this@MainActivity,GuruhlarActivity::class.java)
                startActivity(i)
            }
            mentorlar.setOnClickListener{
                val i=Intent(this@MainActivity,MentorlarActivity::class.java)
                startActivity(i)
            }
        }
    }
}