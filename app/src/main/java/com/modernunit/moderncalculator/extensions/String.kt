package com.modernunit.moderncalculator.extensions

fun String.replaceLastCharBy(newValue: Char): String {
    return if (length >= 2) substring(0, length - 1) + newValue else this
}