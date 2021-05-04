package com.dylan.swoosh

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.dylan.swoosh.databinding.ActivityLeagueBinding
import com.dylan.swoosh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.getStarted.setOnClickListener {
            val leagueIntent = Intent(this, Activity_League::class.java)
            startActivity(leagueIntent)
        }

    }




}