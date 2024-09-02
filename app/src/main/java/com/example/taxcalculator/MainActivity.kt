package com.example.taxcalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val incomeText = findViewById<EditText>(R.id.etIncome)
        val profitText = findViewById<EditText>(R.id.etInvested)
        val percentText = findViewById<EditText>(R.id.etIncome3)
        val incomeButton = findViewById<Button>(R.id.btnIncome)
        val profitButton = findViewById<Button>(R.id.btnInvested)

        incomeButton.setOnClickListener {

            val income = incomeText.text.toString()
            val taxedIncome = income.toFloat() - income.toFloat()* 0.2532
            val taxedIncome2Digits = String.format("%.2f", taxedIncome).toFloat()
            displayIncome(taxedIncome2Digits)
        }
        profitButton.setOnClickListener {

            val profit = profitText.text.toString()
            val percent = percentText.text.toString()
            val totalprofit = profit.toFloat() * percent.toFloat()/100

            val taxedprofit2Digits = String.format("%.2f", totalprofit).toFloat()
            displayProfit(taxedprofit2Digits)
        }
    }
    private fun displayIncome(taxedIncome:Float){
        val resultIncome = findViewById<TextView>(R.id.tvResultIncome)
        resultIncome.text = taxedIncome.toString()


    }
    private fun displayProfit(profit:Float){
        val resultProfit = findViewById<TextView>(R.id.tvResultProfit)
        resultProfit.text = profit.toString()


    }
}