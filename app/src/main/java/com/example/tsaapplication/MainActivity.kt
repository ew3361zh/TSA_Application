package com.example.tsaapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    // private global variables accessible throughout this class
    private lateinit var tapHereButton: Button
    private lateinit var leftArrow: ImageButton
    private lateinit var rightArrow: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    // buttons are initialized asap but need to come after the first two lines in this override
        tapHereButton = findViewById(R.id.tap_here_button)
        leftArrow = findViewById(R.id.left_arrow)
        rightArrow = findViewById(R.id.right_arrow)

//      set up click listeners for the 3 buttons

        tapHereButton.setOnClickListener {
            showRandomArrow()
        }

        leftArrow.setOnClickListener {
            reset()
        }

        rightArrow.setOnClickListener {
            reset()
        }

    }

//    reset function for left/right arrow clicks to revert back to tap here button visibility
    private fun reset() {
        leftArrow.visibility = View.INVISIBLE
        rightArrow.visibility = View.INVISIBLE
        tapHereButton.visibility = View.VISIBLE
    }

//    show random arrow function for the tap clicks
    private fun showRandomArrow() {
        tapHereButton.visibility = View.INVISIBLE
//    built in random function
        val direction = listOf("left", "right").random()
        if (direction == "left") {
            leftArrow.visibility = View.VISIBLE
        } else {
            rightArrow.visibility = View.VISIBLE
        }
    }
}