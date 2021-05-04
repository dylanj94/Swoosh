package Controller
import Controller.Utilities.EXTRA_PLAYER
import Model.Player
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dylan.swoosh.databinding.ActivityLeagueBinding


class Activity_League : AppCompatActivity() {

    private lateinit var binding: ActivityLeagueBinding
    var player = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeagueBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onMensClicked(view: View) {

        binding.womensLeagueBtn.isChecked = false
        binding.CoedLeagueBtn.isChecked = false
        player.league = "mens"

        }

    fun onWomensClicked(view: View) {

        binding.mensLeagueBtn.isChecked = false
        binding.CoedLeagueBtn.isChecked = false
        player.league = "womens"


    }

    fun onCoedClicked(view:View) {

        binding.mensLeagueBtn.isChecked = false
        binding.womensLeagueBtn.isChecked = false
        player.league = "co-ed"


    }


    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT ).show()
        }


    }
}