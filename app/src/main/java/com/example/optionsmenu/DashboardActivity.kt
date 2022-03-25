package com.example.optionsmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        setTitle("Outra pagina")


        val parametro = intent.getStringExtra(PARAM_NOME)
        val textView = findViewById<TextView>(R.id.tv1_dashboard)
        textView.setText(parametro)

    }
}