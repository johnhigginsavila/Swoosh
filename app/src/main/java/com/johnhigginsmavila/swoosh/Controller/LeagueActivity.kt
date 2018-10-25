package com.johnhigginsmavila.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.johnhigginsmavila.swoosh.Model.Player
import com.johnhigginsmavila.swoosh.Utilities.*
import com.johnhigginsmavila.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("", "")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun leagueNextClicked (view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please Select a League", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMenBtnClicked (view: View) {
        womenLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false

        player.league = "men"
    }

    fun onWomenBtnClicked (view: View) {
        menLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false

        player.league = "women"
    }

    fun onCoEdBtnClicked (view: View) {
        menLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

        player.league = "coed"
    }


}
