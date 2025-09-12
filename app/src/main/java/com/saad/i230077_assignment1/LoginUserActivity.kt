package com.saad.i230077_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_user)

        // Find the "Log in" button by its ID
        val loginButton: Button = findViewById(R.id.login_button)

        // Set an OnClickListener to handle the button press
        loginButton.setOnClickListener {
            // Create an Intent to navigate to the HomeActivity
            val intent = Intent(this, HomeActivity::class.java)

            // Start the HomeActivity
            startActivity(intent)

            // Optional: Call finish() to prevent the user from returning to the login screen by pressing the back button
            finish()
        }
    }
}