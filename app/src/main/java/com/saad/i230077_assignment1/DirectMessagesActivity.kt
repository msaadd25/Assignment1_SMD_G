package com.saad.i230077_assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class DirectMessagesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direct_messages)

        val backArrow: ImageView = findViewById(R.id.back_arrow)
        backArrow.setOnClickListener { finish() }

        // Example: open chat when Joshua’s chat is clicked
        val chatJoshua: LinearLayout = findViewById(R.id.chat_joshua)
        chatJoshua.setOnClickListener {
            val intent = Intent(this, ChatScreenActivity::class.java)
            startActivity(intent)
        }


    }
}
