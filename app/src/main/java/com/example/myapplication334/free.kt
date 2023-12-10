package com.example.myapplication334


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import androidx.core.view.GestureDetectorCompat

class free : AppCompatActivity(), GestureDetector.OnGestureListener {
    private var gestureDetectorCompat: GestureDetectorCompat? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_free)
        gestureDetectorCompat = GestureDetectorCompat(this, this)
    }
    fun onMyButtonClick(view: View?) {

        val intent = Intent (this@free, five::class.java)
        startActivity(intent)
    }
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event != null) {
            gestureDetectorCompat!!.onTouchEvent(event)
        }
        return super.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent): Boolean {
        return true
    }

    override fun onShowPress(e: MotionEvent) {
    }

    override fun onSingleTapUp(e: MotionEvent): Boolean {
        return true
    }

    override fun onScroll(
        e1: MotionEvent,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        when(ClassifiedSwipeClass (e1, e2, distanceX, distanceY)
            .defineSwipe(150)) {
            SwipeVariant.SwipeRight ->{
                val intent = Intent (this@free, ford::class.java)
                startActivity(intent)
            }
            SwipeVariant.SwipeLeft ->{
                val intent = Intent (this@free, one::class.java)
                startActivity(intent)
            }
            else -> {
            }
        }
        return true
    }

    override fun onLongPress(e: MotionEvent) {
    }

    override fun onFling(
        e1: MotionEvent,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        return true
    }
}
