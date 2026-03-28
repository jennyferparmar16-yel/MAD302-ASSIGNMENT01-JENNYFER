    /**
     * Course Code: MAD302
     * Assignment: Assignment 1
     * Student Name: Jennyfer Parmar
     * Student ID: A00201240
     * Date of Submission: 2026-03-27
     * Description: Main screen that collects user input, manages a list of courses,
     * and displays them in a RecyclerView.
     */

    package com.example.mad302_assignment01_jennyfer

    import android.content.Intent
    import android.os.Bundle
    import android.widget.Button
    import android.widget.EditText
    import android.widget.Toast
    import androidx.appcompat.app.AppCompatActivity
    import androidx.recyclerview.widget.LinearLayoutManager
    import androidx.recyclerview.widget.RecyclerView

    class MainActivity : AppCompatActivity() {

        // UI View variables using camelCase
        private lateinit var courseCodeEditText: EditText
        private lateinit var courseNameEditText: EditText
        private lateinit var courseDescriptionEditText: EditText
        private lateinit var addCourseButton: Button
        private lateinit var courseRecyclerView: RecyclerView

        // Data source and Adapter
        private val courseList = mutableListOf<Course>()
        private lateinit var courseAdapter: CourseAdapter

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // Initialize UI components
            courseCodeEditText = findViewById(R.id.courseCodeEditText)
            courseNameEditText = findViewById(R.id.courseNameEditText)
            courseDescriptionEditText = findViewById(R.id.courseDescriptionEditText)
            addCourseButton = findViewById(R.id.addCourseButton)
            courseRecyclerView = findViewById(R.id.coursesRecyclerView)

            // Requirement: Create a list of at least 6 courses initially
            setupInitialData()

            // Initialize Adapter with click logic to open DetailActivity
            courseAdapter = CourseAdapter(courseList) { selectedCourse ->
                val intent = Intent(this, DetailActivity::class.java)
                intent.putExtra("courseCode", selectedCourse.code)
                intent.putExtra("courseName", selectedCourse.name)
                intent.putExtra("courseDescription", selectedCourse.description)
                startActivity(intent)
            }

            // Setup RecyclerView
            courseRecyclerView.layoutManager = LinearLayoutManager(this)
            courseRecyclerView.adapter = courseAdapter

            // Handle Add Course Button Click
            addCourseButton.setOnClickListener {
                addNewCourse()
            }
        }

        //Populates the list with 6 initial courses to meet assignment requirements.

        private fun setupInitialData() {
            courseList.add(Course("MAD302", "Android Development", "Learn Kotlin and XML."))
            courseList.add(Course("MAD311", "iOS Development", "Learn Swift and SwiftUI."))
            courseList.add(Course("JS101", "JavaScript Basics", "Web development fundamentals."))
            courseList.add(Course("PY200", "Python for Data", "Data science and analytics."))
            courseList.add(Course("DB300", "Database Systems", "SQL and NoSQL databases."))
            courseList.add(Course("UI105", "UI/UX Design", "User interface design principles."))
        }

        // Validates input and adds a new course to the RecyclerView.

        private fun addNewCourse() {
            val code = courseCodeEditText.text.toString().trim()
            val name = courseNameEditText.text.toString().trim()
            val desc = courseDescriptionEditText.text.toString().trim()

            if (code.isNotEmpty() && name.isNotEmpty()) {
                courseList.add(Course(code, name, desc))
                // Notify adapter to refresh UI
                courseAdapter.notifyItemInserted(courseList.size - 1)

                // Clear inputs
                courseCodeEditText.text.clear()
                courseNameEditText.text.clear()
                courseDescriptionEditText.text.clear()

                Toast.makeText(this, "Course Added", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter Code and Name", Toast.LENGTH_SHORT).show()
            }
        }
    }