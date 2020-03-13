package com.example.geonotfier

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openNewLocation(view: View) {
        val intent = Intent(this, NewLocation::class.java)

        val extras = Bundle()
        intent.putExtras(extras)

        startActivity(intent)
    }
}
