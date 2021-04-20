package com.github.jairrab.module2

import android.os.Bundle
import android.view.View
import com.github.jairrab.core.BaseFragment
import com.github.jairrab.module2.databinding.Module2FragmentBBinding
import com.github.jairrab.viewbindingutility.viewBinding

class Module2FragmentB: BaseFragment(R.layout.module_2_fragment_b) {
    private val binding by viewBinding { Module2FragmentBBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {
            navigate(R.id.action_module_2_fragment_b_to_module_2_fragment_c)
        }
    }
}