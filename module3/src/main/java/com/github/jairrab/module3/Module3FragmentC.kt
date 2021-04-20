package com.github.jairrab.module3

import android.os.Bundle
import android.view.View
import com.github.jairrab.core.BaseFragment
import com.github.jairrab.module3.databinding.Module3FragmentCBinding
import com.github.jairrab.viewbindingutility.viewBinding

class Module3FragmentC: BaseFragment(R.layout.module_3_fragment_c) {
    private val binding by viewBinding { Module3FragmentCBinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}