package com.modernunit.moderncalculator.extensions

import androidx.lifecycle.SavedStateHandle

class SaveableStateFlow<T>(
    initValue: T,
    private val key: String,
    private val savedStateHandle: SavedStateHandle
) {
    private val stateFlow = savedStateHandle.getStateFlow(key, initValue)
    var value: T
        set(value) {
            savedStateHandle[key] = value
        }
        get() = stateFlow.value

    fun asStateFlow() = stateFlow
}

fun SaveableStateFlow<String>.addSymbolToTheEndOfExistingString(symbol: Char) {
    value += symbol
}