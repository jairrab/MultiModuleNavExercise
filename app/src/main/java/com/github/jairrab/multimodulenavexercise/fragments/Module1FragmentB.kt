package com.github.jairrab.multimodulenavexercise.fragments

import android.os.Bundle
import android.view.View
import com.github.jairrab.core.BaseFragment
import com.github.jairrab.multimodulenavexercise.R
import com.github.jairrab.multimodulenavexercise.databinding.Module1FragmentBBinding
import com.github.jairrab.viewbindingutility.viewBinding

class Module1FragmentB : BaseFragment(R.layout.module_1_fragment_b) {
    private val binding by viewBinding { Module1FragmentBBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {
            navigate(R.id.action_module_1_fragment_b_to_module_1_fragment_c)
        }
    }
}