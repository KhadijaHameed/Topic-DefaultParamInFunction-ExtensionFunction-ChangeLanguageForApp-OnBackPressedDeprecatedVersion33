package com.example.practice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample_check_for_lang)


   /*     val locale = Locale("fr")
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        baseContext.resources.updateConfiguration(config, baseContext.resources.displayMetrics)
*/

//        Locale.getDefault().language.contentEquals("fr")

        setLanguageForApp("fr",baseContext)
    }

}