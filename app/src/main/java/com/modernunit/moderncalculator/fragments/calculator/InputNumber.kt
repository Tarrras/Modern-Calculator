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

@Composable
fun WholeExpression(modifier: Modifier = Modifier, wholeExpression: String) {
    Text(
        modifier = modifier,
        text = wholeExpression,
        fontSize = 18.sp,
        color = MaterialTheme.colors.secondary.copy(alpha = 0.8f),
        overflow = TextOverflow.Ellipsis,
        maxLines = 1,
        letterSpacing = 2.sp
    )
}