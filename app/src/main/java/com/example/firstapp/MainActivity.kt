package com.example.firstapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = "タイトル"
        this.title = message
        var product: Long = 1
        for (i in 1..20) {
            product = product * i
        }
        this.title = product.toString()
        val factorial = calculateFactorial(20)
        // this.title = factorial.toString()
        val firstText = findViewById<TextView>(R.id.firstText) as TextView
        firstText.text = factorial.toString()
    }

    private fun calculateFactorial(n: Int): Long {
        var product: Long = 1
        for (i in 1..n) {
            product = product * i
        }
        return product
    }
}
