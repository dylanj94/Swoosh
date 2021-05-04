package com.dylan.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dylan.swoosh.databinding.ActivityLeagueBinding
import com.dylan.swoosh.databinding.ActivityMainBinding


class Activity_League : AppCompatActivity() {

    private lateinit var binding: ActivityLeagueBinding
    var selectedLeague =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onMensClicked(view: View) {

        binding.womensLeagueBtn.isChecked = false
        binding.CoedLeagueBtn.isChecked = false
        selectedLeague = "mens"

        }

    fun onWomensClicked(view: View) {

        binding.mensLeagueBtn.isChecked = false
        binding.CoedLeagueBtn.isChecked = false
        selectedLeague = "womens"


    }

    fun onCoedClicked(view:View) {

        binding.mensLeagueBtn.isChecked = false
        binding.womensLeagueBtn.isChecked = false
        selectedLeague = "co-ed"


    }


    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT ).show()
        }


    }
}