package com.saad.i230077_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        // --- Top tabs ---
        val youTab: TextView = findViewById(R.id.you_tab)
        youTab.setOnClickListener {
            val intent = Intent(this, Notification2Activity::class.java)
            startActivity(intent)
        }

        // --- Bottom nav bar ---
        val homeIcon: ImageView = findViewById(R.id.home_icon)
        val searchIcon: ImageView = findViewById(R.id.search_icon)
        val profileIcon: ImageView = findViewById(R.id.profile_icon_bottom)

        homeIcon.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        searchIcon.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}
