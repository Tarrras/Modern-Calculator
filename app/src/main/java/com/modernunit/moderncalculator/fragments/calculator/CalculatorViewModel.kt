package com.modernunit.moderncalculator.fragments.calculator

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CalculatorViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val operationsList = listOf('=', '/', '(', ')', '*', '+', '-')
    val number = savedStateHandle.getStateFlow(NumberSavedStateKey, "")

    fun onNewSymbol(symbol: Char) {
        when {
            symbol.isDigit() -> {
                addSymbolToTheNumber(symbol)
            }
            symbol == '.' -> {
                if ('.' !in number.value) addSymbolToTheNumber('.')
            }
            symbol in operationsList -> doArithmeticOperation(symbol)
            else -> return
        }
    }

    private fun addSymbolToTheNumber(symbol: Char) {
        savedStateHandle[NumberSavedStateKey] =
            number.value + symbol
    }

    private fun doArithmeticOperation(operation: Char) {
        val bigDecimalNumber = number.value.toBigDecimal()
        when (operation) {

            else -> Unit
        }
        //todo do operation
    }
}

private const val NumberSavedStateKey = "numberState"