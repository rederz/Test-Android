package com.test.app00

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeResult()
    }

    private fun changeResult() {
        uiAcept.setOnClickListener {
            val texI = uiName.text

            //mensaje temporal
            Toast.makeText(this, "Texto enviado: ${texI.toString()}", Toast.LENGTH_LONG).show()

            val nextAct = Intent(this, ResultActivity::class.java)
            nextAct.putExtra("NAME", texI.toString())
            startActivity(nextAct)

            ///*Si uno quiere finalizar la actividad y no regresar a ella*/finish()

        }
    }
}