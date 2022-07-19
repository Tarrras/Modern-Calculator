package com.modernunit.moderncalculator.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.modernunit.moderncalculator.R
import com.modernunit.moderncalculator.fragments.calculator.CalculatorFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        if (savedInstanceState == null) {
            supportFragmentManager.commit {
                replace<CalculatorFragment>(R.id.calculator_base_container)
                setReorderingAllowed(true)
                addToBackStack("CalculatorFragment")
            }
        }
    }

}
