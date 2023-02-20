package com.example.practice.textToPdf

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.practice.R

class EqualityDoubleTriple : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample_check_for_lang)






        val a  = Integer(10)
        val b  = Integer(10)

//        Log.d("testing","${a == b}")        //  true  (CHECKS EQUALS/VALUES)
//        Log.d("testing","${a === b}")       //  false (CHECKS REFERENCES)







//        Log.d("testing" + "","${s1.name === s2.name}")  //  true




        val p1 = Person("KhadijaHameed")
        val p2 = Person("KhadijaHameed")
        val p3 = p1

//        Log.d("testing", "p1.equals(p2)        ${p1.equals(p2)}")         //true
//        Log.d("testing","p1 == p2              ${p1 == p2}")             // true
//        Log.d("testing","p1 === p2             ${p1 === p2}")            // false
//        Log.d("testing","p1.name === p2.name   ${p1.name === p2.name}")  // true
//        Log.d("testing","p1 === p3             ${p1 === p3}")            // true

        var a1 = C()
        var a2 = C()

        //true
        Log.d("testing","a1 == a2              ${a1 == a2}")
    }


    data class Person(var name: String)
     class C()
}