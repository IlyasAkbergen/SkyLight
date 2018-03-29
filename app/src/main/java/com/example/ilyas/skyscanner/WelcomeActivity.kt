package com.example.ilyas.skyscanner

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager
import android.widget.Button

class WelcomeActivity : AppCompatActivity(){

    lateinit var signInBtn : Button
    lateinit var signUpBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        window.setBackgroundDrawableResource(R.drawable.lamp)
        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)

        signInBtn = findViewById(R.id.signInBtn)
        signUpBtn = findViewById(R.id.signUpBtn)

        signInBtn.setOnClickListener {
            val intent: Intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }

        signUpBtn.setOnClickListener{
            val intent: Intent = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
