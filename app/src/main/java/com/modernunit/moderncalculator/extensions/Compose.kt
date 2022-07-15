package com.modernunit.moderncalculator.extensions

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView

fun Context.composeView(content: @Composable () -> Unit) =
    ComposeView(this).apply { setContent(content) }