package com.example.notiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.notiapp.util.PreferenceHelper
import com.example.notiapp.util.PreferenceHelper.set

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnLogout = findViewById<Button>(R.id.btn_logout)
        btnLogout.setOnClickListener {
            clearSessionPreferences()
            btnLogin()
        }
    }

    private fun goToLogin() {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
    }

    private fun clearSessionPreferences() {
        val preferences = PreferenceHelper.defaultPrefs(this)
        preferences["session"] = false
    }
}