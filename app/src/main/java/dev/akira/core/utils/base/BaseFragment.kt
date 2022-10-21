package dev.akira.core.utils.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseFragment(@LayoutRes layout: Int) : Fragment(layout) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        initObservers()
        initClicks()
    }

    protected abstract fun initialize()
    protected open fun initClicks() {}
    protected open fun initObservers() {}

}