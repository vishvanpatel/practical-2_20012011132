package com.example.a20012011132_pr_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    var Tag="mainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    private fun showMessage (msg:String){
        Log.i(Tag,msg)
        Toast.makeText(this, msg,Toast.LENGTH_SHORT).show()
        //Snackbar.make(findViewById(R.id.myCoordinatorLayout), msg, Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart() is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause() is called")
    }
    override fun onResume() {
        super.onResume()
        showMessage("onResume() is called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop() is called")
    }
}