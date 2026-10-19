package com.example.s76272_lab1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val edtEditName = findViewById<EditText>(R.id.edtEditName) //for edit text
        val btnPressMe = findViewById<Button>(R.id.btnPressMe)
        val showHello = findViewById<TextView>(R.id.showHello)

        btnPressMe.setOnClickListener {
            val name = edtEditName.text.toString().trim()
            if (name.isEmpty()){
                showHello.text = "Please enter name as described"
            } else {
                showHello.text = "Selamat Datang, $name"
            }
        }
    }
}