package com.example.ilyas.skyscanner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class RegisterActivity : AppCompatActivity() {

    //public final String APP_ID="asda"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        window.setBackgroundDrawableResource(R.drawable.lamp)
        this.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
    }
}
