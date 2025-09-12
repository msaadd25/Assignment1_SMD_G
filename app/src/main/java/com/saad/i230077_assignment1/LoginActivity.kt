package com.saad.i230077_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signUpLink: TextView = findViewById(R.id.signup_link)
        val loginButton: Button = findViewById(R.id.login_button)

        // Set up the click listener for the "Log in" button
        loginButton.setOnClickListener {
            // Navigate to the main user page after a successful login
            val intent = Intent(this, LoginUserActivity::class.java)
            startActivity(intent)
        }

        // Set up the click listener for the "Sign up" link
        signUpLink.setOnClickListener {
            // Navigate to the SignUpActivity
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}