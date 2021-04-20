package com.github.jairrab.multimodulenavexercise.fragments

import android.os.Bundle
import android.view.View
import com.github.jairrab.core.BaseFragment
import com.github.jairrab.multimodulenavexercise.R
import com.github.jairrab.multimodulenavexercise.databinding.Module1FragmentCBinding
import com.github.jairrab.viewbindingutility.viewBinding

class Module1FragmentC : BaseFragment(R.layout.module_1_fragment_c) {
    private val binding by viewBinding { Module1FragmentCBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {
            navigate(R.id.action_module_1_fragment_c_to_nav_module_2)
        }

        binding.button2.setOnClickListener {
            navigate(R.id.action_module_1_fragment_c_to_nav_module_3)
        }
    }
}