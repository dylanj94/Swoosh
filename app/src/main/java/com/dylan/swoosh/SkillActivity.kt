package com.dylan.swoosh

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SkillActivity : AppCompatActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        var league = if (EXTRA_LEAGUE != null) intent.getStringExtra(EXTRA_LEAGUE)
        else -1
        println(league)

    }
}