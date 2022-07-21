package com.modernunit.moderncalculator.fragments.calculator

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.modernunit.moderncalculator.extensions.SaveableStateFlow
import com.modernunit.moderncalculator.extensions.addSymbolToTheEndOfExistingString
import com.modernunit.moderncalculator.extensions.replaceLastCharBy
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CalculatorViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val operationsList = listOf('/', 'x', '+', '-')
    private val additionalOperationsList = listOf('=', '.', '(', ')', 'C')
    private val internalWholeExpression = SaveableStateFlow(
        key = WholeExpressionSavedStateKey,
        initValue = "",
        savedStateHandle = savedStateHandle
    )
    val wholeExpression = internalWholeExpression.asStateFlow()

    private val internalNumber = SaveableStateFlow(
        key = NumberSavedStateKey,
        initValue = "0",
        savedStateHandle = savedStateHandle
    )
    val number = internalNumber.asStateFlow()

    fun onNewSymbol(symbol: Char) {
        when {
            symbol.isDigit() -> addSymbolToTheNumber(symbol)
            symbol in operationsList -> addArithmeticOperation(symbol)
            symbol in additionalOperationsList -> doSmth(symbol)
            else -> return
        }
    }

    private fun addSymbolToTheNumber(symbol: Char) {
        val currentNumber = internalNumber.value
        when {
            currentNumber == "0" -> {
                internalWholeExpression.value = symbol.toString()
                internalNumber.value = symbol.toString()
            }
            internalWholeExpression.value.lastOrNull() in operationsList -> {
                internalWholeExpression.addSymbolToTheEndOfExistingString(symbol)
                internalNumber.value = symbol.toString()
            }
            currentNumber.length < 10 -> {
                internalWholeExpression.addSymbolToTheEndOfExistingString(symbol)
                internalNumber.addSymbolToTheEndOfExistingString(symbol)
            }
        }
    }


    private fun addArithmeticOperation(operation: Char) {
        when {
            internalWholeExpression.value.isEmpty() -> Unit
            internalWholeExpression.value.lastOrNull() in operationsList -> {
                internalWholeExpression.value =
                    internalWholeExpression.value.replaceLastCharBy(operation)
            }
            else -> internalWholeExpression.addSymbolToTheEndOfExistingString(operation)
        }
    }

    private fun doSmth(symbol: Char) {
        when (symbol) {
            'C' -> {
                clearData()
            }
            '=' -> {
                //todo Parse expression as string :'), below just example implementation
                internalWholeExpression.addSymbolToTheEndOfExistingString('=')
                internalNumber.value = "12345"
            }
            else -> Unit
        }
    }

    private fun clearData() {
        internalNumber.value = "0"
        internalWholeExpression.value = ""
    }
}

private const val NumberSavedStateKey = "numberState"
private const val WholeExpressionSavedStateKey = "wholeExpressionSavedState"