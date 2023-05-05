package com.emre.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.emre.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var no1: Double? = 0.0
    var no2: Double? = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    // Transaction Funcktions

    private fun sumFun(a: Double, b: Double) {
        binding.resultText.text = "Result: ${a + b}"
    }

    private fun minusFun(a: Double, b: Double) {
        binding.resultText.text = "Result: ${a - b}"
    }

    private fun multiplyFun(a: Double, b: Double) {
        binding.resultText.text = "Result: ${a * b}"
    }

    private fun divideFun(a: Double, b: Double) {
        binding.resultText.text = "Result: ${a / b}"
    }

    //Empty Control Function

    private fun isEmpty(): Boolean {
        no1 = binding.number1.text.toString().toDoubleOrNull()
        no2 = binding.number2.text.toString().toDoubleOrNull()
        if (no1 == null || no2 == null) {
            if (no1 == null && no2 == null) {
                binding.number1.hint = "Please enter a number"
                binding.number2.hint = "Please enter a number"
            } else if (no1 == null) {
                binding.number1.hint = "Please enter a number"
            } else {
                binding.number2.hint = "Please enter a number"
            }
            binding.resultText.text = "Error"

            return true

        } else {

            return false
        }
    }

    //Button Functions

    fun sum(view: View) {
        if (!isEmpty()){
            sumFun(no1!!.toDouble(), no2!!.toDouble())
        }
    }
    fun minus(view: View) {
        if (!isEmpty()){
            minusFun(no1!!.toDouble(), no2!!.toDouble())
        }
    }
    fun multiply(view: View) {
        if (!isEmpty()){
            multiplyFun(no1!!.toDouble(), no2!!.toDouble())
        }
    }
    fun divide(view: View) {
        if (!isEmpty()){
            divideFun(no1!!.toDouble(), no2!!.toDouble())
        }
    }

}