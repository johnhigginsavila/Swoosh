package com.johnhigginsmavila.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.johnhigginsmavila.swoosh.R
import com.johnhigginsmavila.swoosh.Utilities.*
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var skill = ""
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        skill = intent.getStringExtra(EXTRA_SKILL)
        league = intent.getStringExtra(EXTRA_LEAGUE)

        searchLeagueTxt.text = "Looking for a $league $skill league near you..."
    }

}
