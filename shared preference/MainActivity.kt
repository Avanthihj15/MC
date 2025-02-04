package com.example.exercise_6
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class MainActivity : AppCompatActivity() {
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
enableEdgeToEdge()
setContentView(R.layout.activity_main)
val firstNameEditText: EditText = findViewById(R.id.editTextText)
val lastNameEditText: EditText = findViewById(R.id.editTextText2)
val numberEditText: EditText = findViewById(R.id.editTextText3)
val emailEditText: EditText = findViewById(R.id.editTextText4)
val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
val saveButton: Button = findViewById(R.id.button)
saveButton.setOnClickListener {
val firstName = firstNameEditText.text.toString()
val lastName = lastNameEditText.text.toString()
val number = numberEditText.text.toString()
val email = emailEditText.text.toString()
val selectedGenderId = radioGroup.checkedRadioButtonId
val selectedGender =
findViewById<RadioButton>(selectedGenderId).text.toString()
val intent = Intent(this, DetailsActivity::class.java).apply {
putExtra("first_name", firstName)
putExtra("last_name", lastName)
putExtra("number", number)
putExtra("email", email)
putExtra("gender", selectedGender)
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
