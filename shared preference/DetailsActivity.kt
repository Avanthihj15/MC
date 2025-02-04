package com.example.exercise_6
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class DetailsActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
enableEdgeToEdge()
setContentView(R.layout.activity_details)
val detailsText: TextView = findViewById(R.id.details_text)
val confirmButton: Button = findViewById(R.id.confirm_button)
val editButton: Button = findViewById(R.id.edit_button)
val firstName = intent.getStringExtra("first_name")
val lastName = intent.getStringExtra("last_name")
val number = intent.getStringExtra("number")
val email = intent.getStringExtra("email")
val gender = intent.getStringExtra("gender")
detailsText.text = "Name: $firstName $lastName\nNumber: $number\nEmail:
$email\nGender: $gender"
editButton.setOnClickListener {
finish()
}
confirmButton.setOnClickListener {
val intent = Intent(this, ConfirmationActivity::class.java).apply {
putExtra("first_name", firstName)
}
startActivity(intent)
}
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
