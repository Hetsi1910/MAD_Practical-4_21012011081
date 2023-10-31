package com.example.mad_practical_4_21012011081

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState) setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.button) button.setOnClickListener{
            val intent1= Intent (this,login::class.java)
            startActivity(intent1)
        }

        val button1=findViewById<Button>(R.id.button1) button1.setOnClickListener{
            val intent2=Intent(this,register::class.java)
            startActivity(intent2)
        }
    }
}
