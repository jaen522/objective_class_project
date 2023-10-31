package com.example.timemoneylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.timemoneylist.databinding.ActivityMainScheduleBinding
import com.example.timemoneylist.ui.theme.Input_schedule

class MainActivity_schedule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainScheduleBinding.inflate(layoutInflater)

        //fragment를 배치하는 코드
        supportFragmentManager.beginTransaction().run{
            //replace(binding.schedule)
            commit()
        }

        setContentView(binding.root)

    }
}
