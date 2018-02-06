package com.utaite.ddlcw.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.utaite.ddlcw.R
import com.utaite.ddlcw.util.setTitle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setTitle(this@MainActivity, R.string.app_name)
    }

}
