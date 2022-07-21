package com.modernunit.moderncalculator.fragments.calculator

import android.content.res.Configuration
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.Scaffold
import com.modernunit.moderncalculator.ui.theme.ModernCalculatorTheme

@Composable
fun CalculatorScreen(
    onSymbolClicked: (symbol: Char) -> Unit,
    inputNumber: String,
    wholeExpression: String,
) = Scaffold { insets ->
    CalculatorContent(
        modifier = Modifier
            .fillMaxSize()
            .padding(insets)
            .padding(WindowInsets.statusBars.asPaddingValues())
            .navigationBarsPadding(),
        onSymbolClicked = onSymbolClicked,
        inputNumber = inputNumber,
        wholeExpression = wholeExpression
    )
}

@Composable
fun CalculatorContent(
    modifier: Modifier = Modifier,
    onSymbolClicked: (symbol: Char) -> Unit,
    inputNumber: String,
    wholeExpression: String,
) =
    Column(
        modifier = modifier.padding(start = 32.dp, end = 32.dp, top = 32.dp, bottom = 16.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            WholeExpression(
                wholeExpression = wholeExpression
            )
            InputNumber(
                modifier = Modifier
                    .animateContentSize(),
                inputNumber = inputNumber
            )
        }
        Keyboard(
            modifier = Modifier
                .fillMaxWidth(),
            onSymbolClicked = onSymbolClicked
        )
    }

@Composable
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    device = "id:pixel_3"
)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun CalculatorScreenPreview() = ModernCalculatorTheme {
    CalculatorScreen({}, "123", wholeExpression = "1+2-3")
}