package com.example.myapplicationsnackbar

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fab : View = findViewById(R.id.fab)
        fab.setOnClickListener {
            view ->
            Snackbar.make(view, "here's a snackbar" , Snackbar.LENGTH_LONG)
                .setAction("Action", null)
                .show()
        }

    }


    fun displayToast(message: String?) {
        Toast.makeText(
            applicationContext, message,
            Toast.LENGTH_SHORT
        ).show()
    }
}