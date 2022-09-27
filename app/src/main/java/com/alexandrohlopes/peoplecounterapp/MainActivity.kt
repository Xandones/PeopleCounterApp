package com.alexandrohlopes.peoplecounterapp

// Here all Kotlin code elements are imported
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

// Here the main class is created and used
class MainActivity : AppCompatActivity() {
    // This is where the function OnCreate sets what will happen at the beginning of the app
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // Instantiates the class
        setContentView(R.layout.activity_main) // Connects the the XML file


        val btnClickMe = findViewById<Button>(R.id.myButton) // Declares a value to set the button Click Me
        val tvmessage = findViewById<TextView>(R.id.txtMessage) // Declares a value to set the TextView Message
        val tvCounter = findViewById<TextView>(R.id.txtCounter) // Declares a value to set the TextView Counter Display - it simply counts from zero to the limits of Kotlin to an integer
        var timesClicked = 0 // Variable that counts how many times the button Click Me was pressed.

        // Sets everything that will happen when the button Click Me is pressed
        btnClickMe.setOnClickListener {
            btnClickMe.text = "HAHA! Wrong answer!" // Sets the Click Me button text to "HAHA! Wrong answer!"
            tvmessage.text = "HAHA! Wrong answer!" // Sets the Message TextView to "HAHA! Wrong answer!"
            timesClicked++ // Increases the value of the counter by 1
            tvCounter.text = timesClicked.toString() // Converts the value of the Counter to String then shows it
            Toast.makeText(this, "Hello! I'm a toast! Don't eat me!", Toast.LENGTH_LONG).show() // Display a message at the bottom of the screen
        }
    }
}