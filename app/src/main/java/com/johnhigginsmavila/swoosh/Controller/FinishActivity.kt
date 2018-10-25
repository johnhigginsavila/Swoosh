package com.johnhigginsmavila.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.johnhigginsmavila.swoosh.Model.Player
import com.johnhigginsmavila.swoosh.R
import com.johnhigginsmavila.swoosh.Utilities.*
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

        searchLeagueTxt.text = "Looking for a ${player.league} ${player.skill} league near you..."
    }

}
