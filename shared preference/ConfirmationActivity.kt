package com.example.exercise_6
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class ConfirmationActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
enableEdgeToEdge()
setContentView(R.layout.activity_confirmation)
val confirmationText: TextView = findViewById(R.id.confirmation_text)
val firstName = intent.getStringExtra("first_name")
confirmationText.text = "Hi $firstName, You are successfully registered"
ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v,
insets ->
val systemBars =
insets.getInsets(WindowInsetsCompat.Type.systemBars())
v.setPadding(systemBars.left, systemBars.top, systemBars.right,
systemBars.bottom)
insets
}
}
}
