package com.example.practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample_check_for_lang)

//        val apiKey = BuildConfig.GMP_KEY
//        val apiKeya = BuildConfig.API_KEY_TEST
//        val apiKeyas = BuildConfig.USER_LOGIN
        val apiKeys = BuildConfig.LOGIN
//        BuildConfig.REG

        //todo:: check how it works on manifest


//        val apiKey = BuildConfig.Api
   /*     val locale = Locale("fr")
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
*/

//        Locale.getDefault().language.contentEquals("fr")

      //  setLanguageForApp("fr",baseContext)
    }

}