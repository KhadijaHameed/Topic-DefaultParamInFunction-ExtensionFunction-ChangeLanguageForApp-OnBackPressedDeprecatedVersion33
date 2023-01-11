package com.example.practice

import android.content.Context
import android.content.res.Configuration
import java.util.*

     fun setLanguageForApp(languageToLoad: String, baseContext: Context) {
        val locale: Locale
        locale = if (languageToLoad == "not-set") { //use any value for default
            Locale.getDefault()
        } else {
            Locale(languageToLoad)
        }
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale = locale
        baseContext.resources.updateConfiguration(
            config,
            baseContext.resources.displayMetrics
        )
    }
