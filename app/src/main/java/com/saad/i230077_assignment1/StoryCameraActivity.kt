package com.saad.i230077_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class StoryCameraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_camera)

        val storyImage: ImageView = findViewById(R.id.single_image_view)

        // Navigate to StoryPublicationActivity when image is clicked
        storyImage.setOnClickListener {
            val intent = Intent(this, StoryPublicationActivity::class.java)
            startActivity(intent)
        }
    }
}
