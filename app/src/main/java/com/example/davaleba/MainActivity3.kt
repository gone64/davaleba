package com.example.davaleba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val name = findViewById<TextView>(R.id.name3)
        val mail = findViewById<TextView>(R.id.mail3)
        val pass = findViewById<TextView>(R.id.password3)
        val rcv = findViewById<TextView>(R.id.receive)
        val rcv1 = findViewById<TextView>(R.id.receive1)
        val rcv2 = findViewById<TextView>(R.id.receive3)
        val intent = getIntent()
        val str = intent.getStringExtra("nam")
        val rec = intent.getStringExtra("pass")
        val rec1 = intent.getStringExtra("mail")

        rcv.setText(str)
        rcv2.setText(rec)
        rcv1.setText(rec1)

    }

    override fun onDestroy() {
        super.onDestroy()
        finish()
    }
}