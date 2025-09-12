package com.saad.i230077_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // --- Top & Bottom Bar Icons ---
        val searchIcon: ImageView = findViewById(R.id.search_icon)
        val messagesIcon: ImageView = findViewById(R.id.messages_icon_top_bar)
        val profileIconBottom: ImageView = findViewById(R.id.profile_icon_bottom)
        val likeIconBottom: ImageView = findViewById(R.id.like_icon_bottom)
        val addIcon: ImageView = findViewById(R.id.add_icon)

        // --- Story Circles ---
        val storyYourStory: ImageView = findViewById(R.id.story_your_story)
        val storyKarennne: ImageView = findViewById(R.id.story_karennne)

        // Navigate to SearchActivity
        searchIcon.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        // Navigate to DirectMessagesActivity
        messagesIcon.setOnClickListener {
            val intent = Intent(this, DirectMessagesActivity::class.java)
            startActivity(intent)
        }

        // Navigate to ProfileActivity
        profileIconBottom.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        // Navigate to NotificationActivity
        likeIconBottom.setOnClickListener {
            val intent = Intent(this, NotificationActivity::class.java)
            startActivity(intent)
        }

        // Navigate to PostActivity (when clicking Add icon)
        addIcon.setOnClickListener {
            val intent = Intent(this, PostActivity::class.java)
            startActivity(intent)
        }

        // Navigate to StoryCameraActivity (when clicking "Your Story")
        storyYourStory.setOnClickListener {
            val intent = Intent(this, StoryCameraActivity::class.java)
            startActivity(intent)
        }

        // Navigate to StoryViewActivity (when clicking "karennne")
        storyKarennne.setOnClickListener {
            val intent = Intent(this, StoryViewActivity::class.java)
            startActivity(intent)
        }
    }
}