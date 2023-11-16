package com.example.notiapp.uo

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import com.example.notiapp.util.PreferenceHelper
import com.example.notiapp.util.PreferenceHelper.get
import com.example.notiapp.util.PreferenceHelper.set
import com.example.notiapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val preferences = PreferenceHelper.defaultPrefs(this)
        if (preferences["session", false])
            goToMenu()


        val tvGoRegister = findViewById<TextView>(R.id.tv_go_to_register)
        tvGoRegister.setOnClickListener{
            goToRegister()
        }
        val btnGoMenu = findViewById<Button>(R.id.tv_go_to_menu)
        btnGoMenu.setOnClickListener{

        }

    }
    private fun goToRegister() {
        val i = Intent(this, RegisterActivity:: class.java)
        startActivity(i)
    }
    private fun btnGoMenu (){
        val i = Intent(this, MenuActivity::class.java)
        createSessionPreferences()
        startActivity(i)
        finish()
    }
    private fun createSessionPreferences(){
        val preferences = PreferenceHelper.defaultPrefs(this)
        preferences["session"] = true
    }
}