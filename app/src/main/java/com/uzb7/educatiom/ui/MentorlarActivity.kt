package com.uzb7.educatiom.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uzb7.educatiom.R
import com.uzb7.educatiom.databinding.ActivityMentorlarBinding

class MentorlarActivity : AppCompatActivity() {
    lateinit var binding: ActivityMentorlarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMentorlarBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}