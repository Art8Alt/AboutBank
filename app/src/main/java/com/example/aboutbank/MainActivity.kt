package com.example.aboutbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Инициализировали объект кнопки
        // Указали объект кнопки на элемент внутри XML
        val registerButton = findViewById<Button>(R.id.activity_main_Button_register)
        // Прикрепили обработчик нажатия к нашей кнопке
        registerButton.setOnClickListener {
            val intentToAnotherScreen = Intent(this@MainActivity, RegistrationActivity::class.java)
            startActivity(intentToAnotherScreen)
            Toast.makeText(this@MainActivity, "You clicked me", Toast.LENGTH_SHORT).show()
        }
    }
}
