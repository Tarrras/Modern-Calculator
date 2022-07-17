package com.modernunit.moderncalculator.fragments.calculator

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.modernunit.moderncalculator.ui.theme.ModernCalculatorTheme


@Composable
fun Keyboard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            KeyboardButton(symbol = '7', onClicked = { })
            KeyboardButton(symbol = '8', onClicked = { })
            KeyboardButton(symbol = '9', onClicked = { })
            KeyboardButton(
                symbol = '!',
                onClicked = { },
                backgroundColor = ModernCalculatorTheme.colors.extendedRed,
                textColor = ModernCalculatorTheme.colors.extendedTextRed
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            KeyboardButton(symbol = '3', onClicked = { })
            KeyboardButton(symbol = '4', onClicked = { })
            KeyboardButton(symbol = '5', onClicked = { })
            KeyboardButton(
                symbol = '6',
                onClicked = { },
                backgroundColor = ModernCalculatorTheme.colors.extendedGreen
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(24.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(intrinsicSize = IntrinsicSize.Min)
        ) {
            Row(modifier = Modifier.weight(1f)) {
                KeyboardButton(
                    symbol = '0', onClicked = { }, aspectRatio = LongButtonAspectRatio,
                )
            }
            Row(
                modifier = Modifier.weight(1f), horizontalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                KeyboardButton(symbol = '1', onClicked = { })
                KeyboardButton(
                    symbol = '2',
                    onClicked = { },
                    backgroundColor = ModernCalculatorTheme.colors.extendedOrange
                )
            }
        }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun KeyboardPreview() = ModernCalculatorTheme {
    Surface {
        Keyboard(modifier = Modifier.padding(horizontal = 32.dp, vertical = 16.dp))
    }
}