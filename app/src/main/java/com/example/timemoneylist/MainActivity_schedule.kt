package com.example.timemoneylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.timemoneylist.databinding.ActivityMainScheduleBinding

class MainActivity_schedule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainScheduleBinding.inflate(layoutInflater)

        val schedule_name : String
        val schedule_memo : String
        val schedule_date : String


        setContentView(binding.root)





    }
}
