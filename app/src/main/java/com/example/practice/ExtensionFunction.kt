package com.example.practice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ExtensionFunction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         extensionFunction()
    }



    private fun extensionFunction() {

        /**
         * Extension Function:
         ** To add custom additional functionality in our existing code.
        It provides ability to extend functionality of existing class without interitting them**
         ** The main d/f of any function/method we define in a class & extension function is:
        It's declared with a prefix receiver type with method name**
        fun <class_name>.<method_name>()


        Most popular example of Extension Function is the let() function, which can be called on any type in Kotlin.
         */

        val name = "android Studio"
        val uppercase = name.let { i -> i.uppercase() }

       // Log.d("Extension", "uppercase text ->  $uppercase")

        /**
         *
        & if you want to add additional functionality in your code,
        do like this ↓

         */

        val phoneNumber: String = "+92 345-1231231"

        fun String.removeWhitespaces() = replace(" ", "")
        fun String.removeMinus() = replace("-", "")
        fun String.removePLus() = replace("+", "")

        val digits = phoneNumber.removeWhitespaces().removeMinus().removePLus()

        Log.d("Extension", "Phone Number ->  $phoneNumber")

        Log.d("Extension", "Digits       ->  $digits")
    }

}

