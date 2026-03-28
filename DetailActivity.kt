/**
Course Code: MAD302
Assignment: Assignment 1
Student Name: Jennyfer Parmar
Student ID: A00201240
Date of Submission: 2026-03-27
Description: Activity to display the details of a specific course.*/

package com.example.mad302_assignment01_jennyfer

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Initialize views using camelCase IDs from your XML
        val codeTextView = findViewById<TextView>(R.id.courseCodeDetailTextView)
        val nameTextView = findViewById<TextView>(R.id.courseNameDetailTextView)
        val descriptionTextView = findViewById<TextView>(R.id.courseDescriptionDetailTextView)

        // Receive data from MainActivity using the keys defined in MainActivity's Intent
        val code = intent.getStringExtra("courseCode")
        val name = intent.getStringExtra("courseName")
        val description = intent.getStringExtra("courseDescription")

        // Show the received data on the screen
        codeTextView.text = code
        nameTextView.text = name
        descriptionTextView.text = description
    }
}