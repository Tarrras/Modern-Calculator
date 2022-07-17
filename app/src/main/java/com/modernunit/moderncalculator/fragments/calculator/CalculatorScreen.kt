package com.modernunit.moderncalculator.fragments.calculator

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.Scaffold

@Composable
fun CalculatorScreen() = Scaffold { insets ->
    Greeting(modifier = Modifier.padding(insets))
}

@Composable
fun Greeting(modifier: Modifier = Modifier) = Box(modifier = modifier) {
    Keyboard(
        modifier = Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 16.dp)
    )
}
