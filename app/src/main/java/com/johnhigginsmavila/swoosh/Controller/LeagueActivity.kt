package com.johnhigginsmavila.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.johnhigginsmavila.swoosh.Utilities.EXTRA_LEAGUE
import com.johnhigginsmavila.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked (view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please Select a League", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMenBtnClicked (view: View) {
        womenLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false

        selectedLeague = "men"
    }

    fun onWomenBtnClicked (view: View) {
        menLeagueBtn.isChecked = false
        coEdLeagueBtn.isChecked = false

        selectedLeague = "women"
    }

    fun onCoEdBtnClicked (view: View) {
        menLeagueBtn.isChecked = false
        womenLeagueBtn.isChecked = false

        selectedLeague = "coed"
    }


}
