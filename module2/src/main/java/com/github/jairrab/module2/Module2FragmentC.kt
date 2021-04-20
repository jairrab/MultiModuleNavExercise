package com.github.jairrab.module2

import android.os.Bundle
import android.view.View
import com.github.jairrab.core.BaseFragment
import com.github.jairrab.module2.databinding.Module2FragmentCBinding
import com.github.jairrab.viewbindingutility.viewBinding

class Module2FragmentC: BaseFragment(R.layout.module_2_fragment_c) {
    private val binding by viewBinding { Module2FragmentCBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}