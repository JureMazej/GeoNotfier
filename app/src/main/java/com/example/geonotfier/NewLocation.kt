package com.example.geonotfier

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NewLocation : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_location)
    }

    fun openMaps(view: View) {
        val intent = Intent(this, NewLocation::class.java)

        val extras = Bundle()
        intent.putExtras(extras)

        startActivity(intent)
    }
}
