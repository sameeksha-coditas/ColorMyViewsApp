package com.example.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                findViewById(R.id.box_one_text),
                findViewById(R.id.box_two_text),
                findViewById(R.id.box_three_text),
                findViewById(R.id.box_four_text),
                findViewById(R.id.box_five_text),
                findViewById(R.id.constraint_layout),
                findViewById(R.id.yellow_button),
                findViewById(R.id.magenta_button),
                findViewById(R.id.cyan_button)
            )

        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(it)
            }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_four_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_five_text -> view.setBackgroundColor(Color.MAGENTA)


            R.id.magenta_button -> view.setBackgroundColor(Color.MAGENTA)

            R.id.yellow_button -> view.setBackgroundColor(Color.YELLOW)

            R.id.cyan_button -> view.setBackgroundColor(Color.CYAN)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}
