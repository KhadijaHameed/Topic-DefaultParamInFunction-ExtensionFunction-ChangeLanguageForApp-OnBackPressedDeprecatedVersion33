package com.example.practice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class OnBackPressedDeprecatedThirtyThreeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

   /* */
    /** onBackPressed Deprecated in Api level 33*//*
    override fun onBackPressed() {
        super.onBackPressed()

    }*/


    /**
    isTaskRoot -> "Check the Activity's Stack, Whether it's last on the stack OR it comes from Notification"

                   (if it's last we can finish the activity.
                OR if it's not, so we do things a\c to condition)

     */
    override fun onBackPressed() {
        if(isTaskRoot){
            finish()
        }else{
            /** Do Your Work Here */
        }
    }


}