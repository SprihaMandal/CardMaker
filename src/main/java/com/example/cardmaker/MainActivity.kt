package com.example.cardmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createTheCard(view: View) {

        //Code for toast making
        val name= findViewById<EditText>(R.id.personName)
        val occName=findViewById<EditText>(R.id.occasionName)
        println("In createTheCard")
        println("name is ${name.text} and occasion name is ${occName.text}")
        val nameText=name.text.toString()
        val occNameText=occName.text.toString()
        var intent= Intent(this,CardActivity::class.java)
        intent.putExtra("displayName",nameText)
        intent.putExtra("occasion",occNameText)
        startActivity(intent)

    }
}