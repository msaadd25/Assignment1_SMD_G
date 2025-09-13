package com.saad.i230077_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class StoryDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_details)

        val bottomToolbar: ImageView = findViewById(R.id.bottom_navigation_bar)

        // On click → move to StoryDetails2Activity
        bottomToolbar.setOnClickListener {
            val intent = Intent(this, StoryDetails2Activity::class.java)
            startActivity(intent)
        }
    }
}
