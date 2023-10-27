package com.example.timemoneylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.timemoneylist.databinding.ActivityMainScheduleBinding

class MainActivity_schedule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainScheduleBinding.inflate(layoutInflater)

        //32분 영상부터 고고
        setContentView(binding.root)

    }
}