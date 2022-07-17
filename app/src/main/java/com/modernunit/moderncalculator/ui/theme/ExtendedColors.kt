package com.modernunit.moderncalculator.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

@Immutable
data class ExtendedColors(
    val extendedOrange: Color,
    val extendedGreen: Color,
    val extendedRed: Color,
    val extendedTextRed: Color,
)

val LightExtendedColors by lazy {
    ExtendedColors(
        extendedOrange = Color(0xFFFF9600),
        extendedGreen = Color(0xFF2ACA74),
        extendedRed = Color(0xFFF8EDEE),
        extendedTextRed = Color(0xFFF64C57)
    )
}

val DarkExtendedColors by lazy {
    ExtendedColors(
        extendedOrange = Color(0xFFFF9600),
        extendedGreen = Color(0xFF2ACA74),
        extendedRed = Color(0xFF291218),
        extendedTextRed = Color(0xFFF64C57),
    )
}

val LocalExtendedColors = staticCompositionLocalOf {
    ExtendedColors(
        extendedOrange = Color.Unspecified,
        extendedGreen = Color.Unspecified,
        extendedRed = Color.Unspecified,
        extendedTextRed = Color.Unspecified,
    )
}