package com.modernunit.moderncalculator.fragments.calculator

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun InputNumber(modifier: Modifier = Modifier, inputNumber: String) {
    Text(
        modifier = modifier,
        text = inputNumber,
        fontSize = 32.sp,
        color = MaterialTheme.colors.secondary,
        overflow = TextOverflow.Clip
    )
}