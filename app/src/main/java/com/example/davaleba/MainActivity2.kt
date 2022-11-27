package com.example.davaleba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val name = findViewById<EditText>(R.id.name2)
        val email = findViewById<EditText>(R.id.mail2)
        val passs = findViewById<EditText>(R.id.password2)
        val rpass = findViewById<EditText>(R.id.repeatpass)
        val signup = findViewById<TextView>(R.id.signup)
        val back = findViewById<TextView>(R.id.back)
        signup.setOnClickListener {
            if (name.text.toString().isEmpty() or email.text.toString().isEmpty() or passs.text.toString().isEmpty() or rpass.text.toString().isEmpty()){
                Toast.makeText(this, "შეავსეთ ყველა ველი!", Toast.LENGTH_SHORT).show()
            }
            else if(passs.text.toString() != rpass.text.toString()){
                Toast.makeText(this, "პაროლები არ ემთხვევა!", Toast.LENGTH_SHORT).show()
            }
            else{
                val nam = name.getText().toString()
                val mail = email.getText().toString()
                val pass = passs.getText().toString()
                val bundle = Bundle()
                bundle.putString("nam", name.getText().toString())
                bundle.putString("mail",email.getText().toString())
                bundle.putString("pass",passs.getText().toString())
                intent = Intent(this,MainActivity3::class.java)
                intent.putExtras(bundle)
                startActivity(intent)


            }



        }
        back.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

    }
}