package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var etNum1: EditText
    lateinit var  etNum2: EditText
    lateinit var btnAdd : Button
    lateinit var btnSubtract : Button
    lateinit var  btnMultiply : Button
    lateinit var  btnDivide : Button
    lateinit var tvResult :TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        castViews()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun castViews(){
        etNum1 = findViewById((R.id.etNum1))
        etNum2 =findViewById(R.id.etNum2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubstract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
        tvResult = findViewById(R.id.tvResult)
    }

    override fun onResume() {
        super.onResume()
        btnAdd.setOnClickListener {
            var num1 =etNum1.text.toString()
            var num2 =etNum2.text.toString()

            var sum =num1.toInt() +num2.toInt()
            tvResult.text = sum.toString()
        }
        btnSubtract.setOnClickListener{
            var num2 =etNum2.text.toString()
            var num1 =etNum1.text.toString()

            var subtract =num2.toInt()-num1.toInt()
            tvResult.text =subtract.toString()
        }
         btnMultiply.setOnClickListener{
            val num5=etNum1.text.toString()
            val num6=etNum2.text.toString()
            val multiply=num5.toInt()*num6.toInt()
            tvResult.text=multiply.toString()
    }
         btnDivide.setOnClickListener{
            val num7=etNum1.text.toString()
            val num8=etNum2.text.toString()
            val multiply=num7.toInt()/num8.toInt()
            tvResult.text=multiply.toString()
}
    }
}
