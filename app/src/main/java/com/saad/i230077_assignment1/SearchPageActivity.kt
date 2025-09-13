package com.saad.i230077_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SearchPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_page)

        // Find the "Clear" TextView by its ID
        val clearTextView: TextView = findViewById(R.id.text_clear)

        // Set a click listener to the "Clear" TextView
        clearTextView.setOnClickListener {
            // Create an Intent to go back to SearchActivity
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)

            // You can also use finish() to close the current activity
            // and return to the previous one on the back stack.
            // finish()
        }
    }
}