package com.saad.i230077_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.jvm.java

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val createAccountButton: Button = findViewById(R.id.create_account_button)

        // Set up the click listener for the "Create an Account" button
        createAccountButton.setOnClickListener {
            // Navigate to the main user page after account creation
            val intent = Intent(this, LoginUserActivity::class.java)
            startActivity(intent)
        }
    }
}