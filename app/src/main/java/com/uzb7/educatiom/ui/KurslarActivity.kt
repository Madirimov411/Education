package com.uzb7.educatiom.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uzb7.educatiom.databinding.ActivityKurslarBinding

class KurslarActivity : AppCompatActivity() {
    lateinit var binding: ActivityKurslarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityKurslarBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setupUI()
    }

    private fun setupUI() {
        binding.apply {

        }
    }
}