package dev.akira.core.utils.extensions

import androidx.viewbinding.ViewBinding

operator fun <T : ViewBinding> T.invoke(init: T.() -> Unit) = init()

