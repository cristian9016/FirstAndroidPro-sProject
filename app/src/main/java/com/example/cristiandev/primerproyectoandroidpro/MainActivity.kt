package com.example.cristiandev.primerproyectoandroidpro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        suma.setOnClickListener(this::operar)
        resta.setOnClickListener(this::operar)
        mult.setOnClickListener(this::operar)
        div.setOnClickListener(this::operar)
    }

    fun operar(view: View) {
        val n1 = num1.text.toString().toInt()
        val n2 = num2.text.toString().toInt()
        val rta = when (view.id) {
            R.id.suma -> n1 + n2
            R.id.resta -> n1 - n2
            R.id.mult -> n1 * n2
            else -> n1 / n2
        }
        res.text = "$rta"
    }
}
