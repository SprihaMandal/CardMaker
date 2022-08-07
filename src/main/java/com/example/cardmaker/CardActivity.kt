package com.example.cardmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)
        val dis: String?=intent.getStringExtra("displayName")
        val occ: String?=intent.getStringExtra("occasion")
        //Element
        val disNameEle= findViewById<TextView>(R.id.greeting)
        val occEle=findViewById<TextView>(R.id.occassionText)
        //Setting the element
        occEle.text= occ
        disNameEle.text = dis

    }
}