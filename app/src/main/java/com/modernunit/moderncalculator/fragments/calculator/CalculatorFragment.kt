package com.modernunit.moderncalculator.fragments.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.modernunit.moderncalculator.extensions.composeView
import com.modernunit.moderncalculator.ui.theme.ModernCalculatorTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CalculatorFragment : Fragment() {

    private val viewModel: CalculatorViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = requireContext().composeView {
        val number by viewModel.number.collectAsState()

        ModernCalculatorTheme {
            CalculatorScreen(onSymbolClicked = viewModel::onNewSymbol, inputNumber = number)
        }
    }

}