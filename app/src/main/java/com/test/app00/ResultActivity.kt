package com.test.app00

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        if (savedInstanceState == null && this.intent.hasExtra("NAME")) {

            println(intent.getStringExtra("NAME"))

            val nameEntered = intent.getStringExtra("NAME")
            println(nameEntered)

            val entered = findViewById<TextView>(R.id.uiNameEntered)
            nameEntered.also { entered.text = it }
        }

        val view = this.findViewById<View>(R.id.actResult)

        //mensaje temporal mientras la vista este activa
        Snackbar.make(view, "Bienvenido a Resultados", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show()
    }
}