package com.example.davaleba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val email = findViewById<EditText>(R.id.mail)
        val pswr = findViewById<EditText>(R.id.password)
        val login = findViewById<TextView>(R.id.login)
        val crtacc = findViewById<TextView>(R.id.createacc)
        val name = findViewById<EditText>(R.id.name)


        login.setOnClickListener {
            if (email.text.toString().isEmpty() or pswr.text.toString().isEmpty() or name.text.toString().isEmpty()){
                Toast.makeText(this, "შეავსეთ ველი!", Toast.LENGTH_SHORT).show()
            }
            else{
                val nam = name.getText().toString()
                val mail = email.getText().toString()
                val pass = pswr.getText().toString()
                val bundle = Bundle()
                bundle.putString("nam", name.getText().toString())
                bundle.putString("mail",email.getText().toString())
                bundle.putString("pass",pswr.getText().toString())
                intent = Intent(this,MainActivity3::class.java)
                intent.putExtras(bundle)
                startActivity(intent)


            }

        }
        crtacc.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

    }
}