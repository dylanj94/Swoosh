package com.dylan.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.getStarted)
        button.setOnClickListener {
            val leagueIntent = Intent(this, Activity_League::class.java)
            startActivity(leagueIntent)
        }

    }




}