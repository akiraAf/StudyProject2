package dev.akira.core.ui

import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import dev.akira.core.R
import dev.akira.core.databinding.FragmentMainBinding
import dev.akira.core.utils.base.BaseFragment

@AndroidEntryPoint
class MainFragment : BaseFragment(R.layout.fragment_main) {
    private val bind by viewBinding(FragmentMainBinding::bind)

    override fun initialize() {
        bind.apply {
            bind.textView.text = "MDA"

        }
    }
}