package com.example.timemoneylist.ui.theme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.timemoneylist.R
import com.example.timemoneylist.databinding.FragmentInputScheduleBinding

class Input_schedule(val str: String) : Fragment() { //밖에서도 쓸 수 있게 val로 선언
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentInputScheduleBinding.inflate(inflater, container, false) // xml에 들어가있는 여러가지것들을 직접 바인딩의 프로퍼티로 접근할 수 있게
        binding.scheduleName.setText(str) //이름 입력받는거 문자열로
        binding.scheduleMemo.setText(str) //메모 입력받는거 문자열로
        binding.scheduleDate.setText(str) //날짜 입력받을때 문자열로
        return binding.root
    }

  /*
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Input_schedule().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

   */
}