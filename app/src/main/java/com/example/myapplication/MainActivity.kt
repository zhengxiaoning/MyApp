package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.text).setOnClickListener {
           val dialogFragment = MyDialogFragment()
            dialogFragment.show(supportFragmentManager,"fa4")
        }

    }

    override fun onStart() {
        super.onStart()
        Log.d("zhengxiaoning","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("zhengxiaoning","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("zhengxiaoning","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("zhengxiaoning","onStop")
    }
}