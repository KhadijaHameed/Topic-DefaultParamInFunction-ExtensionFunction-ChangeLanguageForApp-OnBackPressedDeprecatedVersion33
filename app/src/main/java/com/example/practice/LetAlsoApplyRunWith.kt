package com.example.practice

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class LetAlsoApplyRunWith : AppCompatActivity() {

//    private var number: Int? = null
    var age = 1
    var b = 2

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //============================================================================

        /** Let */
        var number:Int?  = null

        number?.let {
            it + 2     //uses the context it
        }


        number?.let { givenNo ->
            givenNo + 2   //uses the context a named parameter
            number   //return last expression
        }


        /** Nesting Let */

        var position = "Android"
        position.let { outer ->
            outer.let { inner ->
                Log.i("test","Inner is $inner and outer is $outer")
            }
        }




        /** let Elvis run */
        var month: String? = null

        month?.let {
            month =  "month is $month"
        }?: run{
            month = "default value of month is: January"
            month
        }


        Log.i("test", " $month")





        //============================================================================




        /*** Run expression */

        var day: String? = null


        day.run {
         day =   "the day before tuesday"
        }
       Log.i("test", day!!)










        //============================================================================



        /** apply */

        var user = User("Khadija", "Hameed")

        user.apply {
            this.firstName = "KH "
        }

        Log.i("test", " $user")




        /** also */
        //we can do swap values through .also scope

        var a = 1
        var b = 2
        a = b.also{
            b = a
        }

        Log.i("testing", "a -> $a    b -> $b")







        //============================================================================

//        var webview:WebView = WebView()

        /** with  */

       /* with(webview.settings){
            javaScriptEnabled = true
            domStorageEnabled = true
            userAgentString = "agent"
            // below last statement, so it will be return type of with
            webview
        }*/





    }

}