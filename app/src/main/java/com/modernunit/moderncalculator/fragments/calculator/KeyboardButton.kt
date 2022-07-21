package com.modernunit.moderncalculator.fragments.calculator

import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.modernunit.moderncalculator.ui.theme.ModernCalculatorTheme

@Composable
fun RowScope.KeyboardButton(
    modifier: Modifier = Modifier,
    symbol: Char,
    weight: Float = 1f,
    textColor: Color = MaterialTheme.colors.secondary,
    backgroundColor: Color = MaterialTheme.colors.primary,
    onClicked: (Char) -> Unit
) {
    Button(
        modifier = modifier
            .weight(weight)
            .heightIn(min = 70.dp, max = 100.dp),
        onClick = { onClicked(symbol) },
        shape = RoundedCornerShape(30),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = textColor
        )
    ) {
        Text(
            text = symbol.toString(),
            fontSize = 24.sp,
            fontFamily = FontFamily.SansSerif
        )
    }
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    device = "id:pixel_2"
)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun KeyboardNumberButtonPreview() = ModernCalculatorTheme {
    Surface {
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Row(
                modifier = Modifier
                    .padding(horizontal = 32.dp),
                horizontalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                KeyboardButton(symbol = '3', onClicked = { })
                KeyboardButton(symbol = '4', onClicked = { })
                KeyboardButton(symbol = '5', onClicked = { })
                KeyboardButton(symbol = '6', onClicked = { })
            }
            Row(
                modifier = Modifier
                    .padding(horizontal = 32.dp)
                    .height(intrinsicSize = IntrinsicSize.Min),
                horizontalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                ) {
                    KeyboardButton(
                        symbol = '0',
                        onClicked = { }
                    )
                }
                Row(
                    modifier = Modifier.weight(1f),
                    horizontalArrangement = Arrangement.spacedBy(24.dp)
                ) {
                    KeyboardButton(
                        symbol = '1', onClicked = { }
                    )
                    KeyboardButton(
                        symbol = '2', onClicked = { }
                    )
                }
            }
        }
    }
}