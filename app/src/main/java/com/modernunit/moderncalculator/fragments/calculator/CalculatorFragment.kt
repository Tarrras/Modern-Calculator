package com.modernunit.moderncalculator.fragments.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.modernunit.moderncalculator.extensions.composeView
import com.modernunit.moderncalculator.ui.theme.ModernCalculatorTheme

class CalculatorFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = requireContext().composeView {
        ModernCalculatorTheme {
            CalculatorScreen()
        }
    }
}