package com.github.jairrab.module3

import android.os.Bundle
import android.view.View
import com.github.jairrab.core.BaseFragment
import com.github.jairrab.module3.databinding.Module3FragmentABinding
import com.github.jairrab.viewbindingutility.viewBinding

class Module3FragmentA:BaseFragment(R.layout.module_3_fragment_a) {
    private val binding by viewBinding { Module3FragmentABinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {
            navigate(R.id.action_module_3_fragment_a_to_module_3_fragment_b)
        }
    }
}