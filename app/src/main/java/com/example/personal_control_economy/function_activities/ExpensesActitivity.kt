package com.example.personal_control_economy.function_activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.personal_control_economy.databinding.ActivityExpensesActitivityBinding

class ExpensesActitivity : AppCompatActivity() {

    private lateinit var binding: ActivityExpensesActitivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExpensesActitivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}