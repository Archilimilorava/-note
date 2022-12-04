package com.example.blacknote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var note:EditText
    private lateinit var add:Button
    private lateinit var text:TextView
    private lateinit var string:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        note = findViewById(R.id.note)
        add = findViewById(R.id.button)
        text = findViewById(R.id.textView)

        add.setOnClickListener{
            string = note.text.toString()
            text.text = string

        }
    }
}