package com.example.teample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.teample.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    var binding:FragmentMainBinding?=null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentMainBinding.inflate(inflater)
        return binding?.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding=null
    }
}