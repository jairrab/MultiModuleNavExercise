package com.github.jairrab.multimodulenavexercise.fragments

import android.os.Bundle
import android.view.View
import androidx.core.net.toUri
import androidx.navigation.fragment.findNavController
import com.github.jairrab.core.BaseFragment
import com.github.jairrab.multimodulenavexercise.R
import com.github.jairrab.multimodulenavexercise.databinding.Module1FragmentABinding
import com.github.jairrab.viewbindingutility.viewBinding

class Module1FragmentA: BaseFragment(R.layout.module_1_fragment_a) {
    private val binding by viewBinding { Module1FragmentABinding.bind(it) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button1.setOnClickListener {
            navigate(R.id.action_module_1_fragment_a_to_module_1_fragment_b)
        }

        binding.button2.setOnClickListener {
            navigate("myapp://module2".toUri())
        }

        binding.button3.setOnClickListener {
            navigate("myapp://module3".toUri())
        }
    }
}