package com.modernunit.moderncalculator.fragments.calculator

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.modernunit.moderncalculator.ui.theme.ModernCalculatorTheme


@Composable
fun Keyboard(
    modifier: Modifier = Modifier,
    onSymbolClicked: (Char) -> Unit
) {
    val spaceDp = 16.dp
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(spaceDp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(spaceDp)
        ) {
            KeyboardButton(
                symbol = 'C',
                onClicked = onSymbolClicked,
                textColor = ModernCalculatorTheme.colors.extendedTextRed,
                backgroundColor = ModernCalculatorTheme.colors.extendedRed
            )
            KeyboardButton(symbol = '(', onClicked = onSymbolClicked)
            KeyboardButton(symbol = ')', onClicked = onSymbolClicked)
            KeyboardButton(
                symbol = '/',
                onClicked = onSymbolClicked,
                backgroundColor = ModernCalculatorTheme.colors.extendedOrange,
                textColor = Color.White
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(spaceDp)
        ) {
            KeyboardButton(symbol = '7', onClicked = onSymbolClicked)
            KeyboardButton(symbol = '8', onClicked = onSymbolClicked)
            KeyboardButton(symbol = '9', onClicked = onSymbolClicked)
            KeyboardButton(
                symbol = 'x',
                onClicked = onSymbolClicked,
                backgroundColor = ModernCalculatorTheme.colors.extendedOrange,
                textColor = Color.White
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(spaceDp)
        ) {
            KeyboardButton(symbol = '4', onClicked = onSymbolClicked)
            KeyboardButton(symbol = '5', onClicked = onSymbolClicked)
            KeyboardButton(symbol = '6', onClicked = onSymbolClicked)
            KeyboardButton(
                symbol = '-',
                onClicked = onSymbolClicked,
                backgroundColor = ModernCalculatorTheme.colors.extendedOrange,
                textColor = Color.White
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(spaceDp)
        ) {
            KeyboardButton(symbol = '1', onClicked = onSymbolClicked)
            KeyboardButton(symbol = '2', onClicked = onSymbolClicked)
            KeyboardButton(symbol = '3', onClicked = onSymbolClicked)
            KeyboardButton(
                symbol = '+',
                onClicked = onSymbolClicked,
                backgroundColor = ModernCalculatorTheme.colors.extendedOrange,
                textColor = Color.White
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(spaceDp),
            modifier = Modifier
                .fillMaxWidth()
                .height(intrinsicSize = IntrinsicSize.Min)
        ) {
            Row(modifier = Modifier.weight(1f)) {
                KeyboardButton(
                    symbol = '0', onClicked = onSymbolClicked,
                )
            }
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.spacedBy(spaceDp)
            ) {
                KeyboardButton(symbol = '.', onClicked = onSymbolClicked)
                KeyboardButton(
                    symbol = '=',
                    onClicked = onSymbolClicked,
                    backgroundColor = ModernCalculatorTheme.colors.extendedGreen,
                    textColor = Color.White
                )
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, device = "id:pixel_4a")
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun KeyboardPreview() = ModernCalculatorTheme {
    Surface {
        Keyboard(
            modifier = Modifier.padding(
                horizontal = 32.dp,
                vertical = 16.dp
            ),
            onSymbolClicked = {})
    }
}
