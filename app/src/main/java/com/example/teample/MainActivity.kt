package com.example.teample

import android.icu.text.DateFormat
import android.icu.text.SimpleDateFormat
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.CalendarView
import android.widget.TextView
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.teample.databinding.ActivityMainBinding
import java.util.Date

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        val navController = binding.frgNav.getFragment<NavHostFragment>().navController
        setContentView(binding.root)
        setContentView(R.layout.fragment_main)
        //객체 생성
        val txtDate : TextView = findViewById(R.id.txt_date)
        val calendarView: CalendarView=findViewById(R.id.calendarView)
        //날짜 형태
        val dateFormat: DateFormat =SimpleDateFormat("yyyy년MM월dd일")
        //date 타입
        val date: Date = Date(calendarView.date)
        //현재 날짜 담기
        txtDate.text= dateFormat.format(date)
        //calender 날짜 변환
        calendarView.setOnDateChangeListener{calendarView, year, month, dayOfMonth->
            var day:String ="${year}년 ${month}월 ${dayOfMonth}일" //날짜 변수에 담기
            txtDate.text=day  //변수 텍스트뷰에 담기
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        val navController=binding.frgNav.getFragment<NavHostFragment>().navController
        return navController.navigateUp()||super.onSupportNavigateUp()
    }


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recSchedule.layoutManager=LinearLayoutManager(this)
        binding.recSchedule.adapter=ScheduleAdapter()
    }
}