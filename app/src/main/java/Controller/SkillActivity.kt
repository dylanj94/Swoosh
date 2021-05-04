package Controller

import Controller.Utilities.EXTRA_LEAGUE
import Controller.Utilities.EXTRA_SKILL
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

    var league = ""
    var skill= " "
    private lateinit var binding: ActivitySkillBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkillBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var league = if (EXTRA_LEAGUE != null) intent.getStringExtra(
            EXTRA_LEAGUE
        )
        else -1

    }

    fun onBallerClick(view: View) {
        binding.beginnerSkillBtn.isChecked = false
        skill = "baller"


    }

    fun onBeginnerClick(view:View) {
        binding.ballerSkillBtn.isChecked = false
        skill = "beginner"

    }
    fun onSkillFinishedClicked(view: View) {
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }


    }
}