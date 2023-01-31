package com.uzb7.educatiom.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uzb7.educatiom.databinding.ActivityGuruhlarBinding

class GuruhlarActivity : AppCompatActivity() {
    lateinit var binding: ActivityGuruhlarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityGuruhlarBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}