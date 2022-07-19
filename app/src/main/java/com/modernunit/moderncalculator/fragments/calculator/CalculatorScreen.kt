package com.modernunit.moderncalculator.fragments.calculator

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.Scaffold

@Composable
fun CalculatorScreen(
    onSymbolClicked: (symbol: Char) -> Unit,
    inputNumber: String,
) = Scaffold { insets ->
    CalculatorContent(
        modifier = Modifier
            .fillMaxSize()
            .padding(insets)
            .padding(WindowInsets.statusBars.asPaddingValues())
            .navigationBarsPadding(),
        onSymbolClicked = onSymbolClicked,
        inputNumber = inputNumber,
    )
}

@Composable
fun CalculatorContent(
    modifier: Modifier = Modifier,
    onSymbolClicked: (symbol: Char) -> Unit,
    inputNumber: String,
) =
    Column(
        modifier = modifier.padding(start = 32.dp, end = 32.dp, top = 32.dp, bottom = 16.dp),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        InputNumber(
            modifier = Modifier
                .animateContentSize(),
            inputNumber = inputNumber
        )
        Keyboard(
            modifier = Modifier
                .fillMaxWidth(),
            onSymbolClicked = onSymbolClicked
        )
    }
