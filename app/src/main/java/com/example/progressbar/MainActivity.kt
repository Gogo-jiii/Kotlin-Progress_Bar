package com.example.progressbar

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.progressindicator.CircularProgressIndicator
import com.google.android.material.progressindicator.LinearProgressIndicator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        circularProgressIndicator.indicatorDirection = CircularProgressIndicator.INDICATOR_DIRECTION_COUNTERCLOCKWISE
        circularProgressIndicator.indicatorSize = 150
        circularProgressIndicator.trackThickness = 10
        circularProgressIndicator.isIndeterminate = true
        circularProgressIndicator.setIndicatorColor(resources.getColor(R.color.orange))

        linearProgressIndicator.indicatorDirection = LinearProgressIndicator.INDICATOR_DIRECTION_RIGHT_TO_LEFT
        linearProgressIndicator.setIndicatorColor(*resources.getIntArray(R.array.progress_colors))
        linearProgressIndicator.isIndeterminate = true
        linearProgressIndicator.indeterminateAnimationType = LinearProgressIndicator.INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS

        btnShowProgressbars.setOnClickListener {
            circularProgressIndicator.visibility = View.VISIBLE
            linearProgressIndicator.visibility = View.VISIBLE
        }
    }
}