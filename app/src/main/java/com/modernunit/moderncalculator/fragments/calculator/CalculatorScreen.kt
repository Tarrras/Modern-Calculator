package com.modernunit.moderncalculator.fragments.calculator

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.accompanist.insets.ui.Scaffold
import com.modernunit.moderncalculator.ui.theme.ModernCalculatorTheme

@Composable
fun CalculatorScreen() = Scaffold {
    Greeting()
}

@Composable
fun Greeting(modifier: Modifier = Modifier) =
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(4),
        contentPadding = WindowInsets.statusBars.only(
            WindowInsetsSides.Horizontal + WindowInsetsSides.Top
        ).add(WindowInsets(left = 32.dp, right = 32.dp)).asPaddingValues(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(50, key = { it }) { number ->
            Button(
                modifier = Modifier.aspectRatio(1f),
                onClick = { },
                shape = CircleShape,
            ) {
                Text(text = number.toString())
            }
        }
    }

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ModernCalculatorTheme {
        Greeting()
    }
}