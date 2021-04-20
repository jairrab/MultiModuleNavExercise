package com.github.jairrab.core

import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController

abstract class BaseFragment(@LayoutRes resId: Int) : Fragment(resId) {

    fun navigate(@IdRes resId: Int) {
        val navOptions = NavOptions.Builder()
            .setEnterAnim(R.anim.enter_from_right)
            .setExitAnim(R.anim.exit_to_left)
            .setPopEnterAnim(R.anim.enter_from_left)
            .setPopExitAnim(R.anim.exit_to_right)
            .build()
        findNavController().navigate(resId, null, navOptions)
    }
}