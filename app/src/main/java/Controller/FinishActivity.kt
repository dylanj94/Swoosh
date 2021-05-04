package Controller

import Controller.Utilities.EXTRA_PLAYER
import Model.Player
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

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        if (player != null) {
            binding.searchLeaguesText.text = "Looking for ${player.league} ${player.skill} " +
                    "league near you..."
        }




    }
}