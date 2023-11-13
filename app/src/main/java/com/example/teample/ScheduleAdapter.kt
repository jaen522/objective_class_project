package com.example.teample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.teample.databinding.ListScheduleBinding

class ScheduleAdapter : RecyclerView.Adapter<ScheduleAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding=ListScheduleBinding.inflate(LayoutInflater.from(parent.context))
        return Holder(binding)
    }

    override fun getItemCount()=shedule.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(schedule[poistion])
    }
    class Holder(private val binding: ListScheduleBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(schedule: Schedule){
            binding.imageView.setImageResource(when(schedule.category){
                ECatagory.FRIENDS->R.drawable.friends
                ECatagory.SCHOOL->R.drawable.school
                ECatagory.WORKOUT->R.drawable.workout
            })
            binding.txtScheduleName.text=schedule.name
            binding.txtScheduleMemo.text=schedule.memo
            binding.txtScheduleTimeStart.text=schedule.timeStart
            binding.txtScheduleTimeEnd.text=schedule.timeEnd
        }
    }
}