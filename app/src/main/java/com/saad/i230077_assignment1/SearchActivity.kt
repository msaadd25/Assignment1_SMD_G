package com.saad.i230077_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        // Find the EditText for the search bar
        val searchEditText: EditText = findViewById(R.id.search_bar) // Make sure your EditText has this ID

        // Find the bottom navigation icons
        val homeIcon: ImageView = findViewById(R.id.home_icon)
        val searchIcon: ImageView = findViewById(R.id.search_icon)
        val likeIcon: ImageView = findViewById(R.id.like_icon_bottom)

        // When Home is clicked → go to HomeActivity
        homeIcon.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // optional: closes SearchActivity so back button won’t return here
        }

        // When Search is clicked → stay on SearchActivity
        searchIcon.setOnClickListener {
            // Do nothing, already here
        }

        // When Like is clicked → go to NotificationActivity
        likeIcon.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        // When the search bar (EditText) is clicked → go to SearchPageActivity
        searchEditText.setOnClickListener {
            val intent = Intent(this, SearchPageActivity::class.java)
            startActivity(intent)
        }
    }
}
