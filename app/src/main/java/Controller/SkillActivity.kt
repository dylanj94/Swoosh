package Controller

import Controller.Utilities.EXTRA_PLAYER
import Model.Player
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.dylan.swoosh.R
import com.dylan.swoosh.databinding.ActivityMainBinding
import com.dylan.swoosh.databinding.ActivitySkillBinding

class SkillActivity : AppCompatActivity() {

    lateinit var player: Player
    private lateinit var binding: ActivitySkillBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        setContentView(binding.root)
        player = intent.getParcelableExtra<Player>(
            EXTRA_PLAYER
        )!!

    }

    fun onBallerClick(view: View) {
        binding.beginnerSkillBtn.isChecked = false
        player.skill = "baller"


    }

    fun onBeginnerClick(view:View) {
        binding.ballerSkillBtn.isChecked = false
        player.skill = "beginner"

    }
    fun onSkillFinishedClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }


    }
}