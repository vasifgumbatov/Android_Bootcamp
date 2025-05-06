package com.vasifgumbatov.androidbootcamp.odev_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.androidbootcamp.R
import com.example.androidbootcamp.databinding.FragmentCalculatorBinding

class Calculator : Fragment() {
    private lateinit var binding: FragmentCalculatorBinding
    private var sum = 0
    private var currentInput = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentCalculatorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val numberOfButtons = listOf(
            binding.btn1,
            binding.btn2,
            binding.btn3,
            binding.btn4,
            binding.btn5,
            binding.btn6,
            binding.btn7,
            binding.btn8,
            binding.btn9,
            binding.btn0
        )

        numberOfButtons.forEach {button ->
            button.setOnClickListener {
                currentInput += button.text
                binding.tvResult.text = currentInput
            }
        }

        binding.btnPlus.setOnClickListener {
            sum += currentInput.toInt()
            currentInput += "+"
            binding.tvResult.text = currentInput
        }

        binding.btnEqual.setOnClickListener {
            sum += currentInput.toInt()
            binding.tvResult.text = sum.toString()
        }

        binding.btnClear.setOnClickListener {
            sum = 0
            currentInput = ""
            binding.tvResult.text = "0"
        }
    }
}