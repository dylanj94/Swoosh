package Controller

import Controller.Utilities.EXTRA_LEAGUE
import Controller.Utilities.EXTRA_SKILL
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dylan.swoosh.databinding.ActivityFinishBinding
import com.dylan.swoosh.databinding.ActivityMainBinding
import com.dylan.swoosh.databinding.ActivitySkillBinding

class FinishActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFinishBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        binding.searchLeaguesText.text = "Looking for $league $skill league near you..."


    }
}