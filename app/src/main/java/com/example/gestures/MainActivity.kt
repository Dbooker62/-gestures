package com.example.gestures

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.GestureDetectorCompat

class MainActivity : AppCompatActivity() , GestureDetector.OnGestureListener , GestureDetector.OnDoubleTapListener {

     lateinit var gDetector: GestureDetectorCompat
     lateinit var tvGestureInfo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tvGestureInfo = findViewById(R.id.tvGestureInfo)
        this.gDetector = GestureDetectorCompat(this, this).apply{

            setOnDoubleTapListener(this@MainActivity)
        }

    }


    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector.onTouchEvent(event)
        return super.onTouchEvent(event)


    }

    override fun onDown(p0: MotionEvent): Boolean {

        return true
    }

    override fun onShowPress(p0: MotionEvent) {


    }


    override fun onSingleTapUp(p0: MotionEvent): Boolean {
        tvGestureInfo.text = "Single Tap"
        tvGestureInfo.setTextColor(Color.GREEN)
        return true

    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent, p2: Float, p3: Float): Boolean {

        return true
    }


    override fun onLongPress(p0: MotionEvent) {
        tvGestureInfo.text = "Long Press"
        tvGestureInfo.setTextColor(Color.RED)
        tvGestureInfo.textSize = 30f // Increase text size for long press

    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent, p2: Float, p3: Float): Boolean {

        return true
    }

    override fun onSingleTapConfirmed(p0: MotionEvent): Boolean {

        return true
    }

    override fun onDoubleTap(p0: MotionEvent): Boolean {

        return true
    }


    override fun onDoubleTapEvent(p0: MotionEvent): Boolean {

        tvGestureInfo.text = "Double Tap"
        tvGestureInfo.setTextColor(Color.RED)
        tvGestureInfo.textSize = 20f // Increase text size for long press

        return true
    }
}


