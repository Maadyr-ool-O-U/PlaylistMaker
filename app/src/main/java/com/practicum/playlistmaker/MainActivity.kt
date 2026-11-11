package com.practicum.playlistmaker

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
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

        val searchButton = findViewById<Button>(R.id.btn_search)
        val mediaLibraryButton = findViewById<Button>(R.id.btn_media_library)
        val settingsButton = findViewById<Button>(R.id.btn_settings)

        searchButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(
                    this@MainActivity,
                    "Нажата кнопка Поиск!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
        mediaLibraryButton.setOnClickListener {
            Toast.makeText(
                this,
                "Нажата кнопка Медиатека!",
                Toast.LENGTH_SHORT
            ).show()
        }
        settingsButton.setOnClickListener {
            Toast.makeText(
                this,
                "Нажата кнопка Настройки!",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}