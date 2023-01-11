package com.example.practice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class DefaultParamInFunction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /**
         *
          In Kotlin, if we pass the default parameter in a function
          If the function is called with argument(s) value, those arguments are used as parameters.
          */
        profile("Khadija_Hameed")


        /**  if we pass specific param's values */
        profile(isDeveloper = true, year = 2022)
        /** and all values */
        profile("Khadija_Hameed", true, 2022)



        /**
         * Besides that,
        if the function is called without passing argument(s), default arguments are used.
         */
        profile()


    }



    private fun profile(name: String ="null", isDeveloper: Boolean =false, year: Int = 0 ) {
        Log.d("Params", "NAME: $name  IsDEVELOPER: $isDeveloper Year: $year")
    }


    override fun onBackPressed() {
        super.onBackPressed()
    }



}

