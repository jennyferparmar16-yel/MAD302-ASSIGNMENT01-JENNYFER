# MAD302 Assignment 1 – Course RecyclerView App

## Student Information
**Student Name:** Jennyfer Parmar  
**Student ID:** A00201240  
**Course Code:** MAD302  
**Assignment:** Assignment 1  
**Date of Submission:** 2026-03-27  

## Project Overview
This project is an Android application developed in Kotlin for MAD302 Assignment 1. The purpose of this application is to demonstrate how to use a RecyclerView to display a list of courses and how to open a second screen to show full course details when a user selects a course item.

The app contains two screens:
- **Main Screen:** Allows the user to enter course information, add new courses, and view the list of available courses in a RecyclerView.
- **Detail Screen:** Displays the selected course code, course name, and course description.

## Features
- Uses a Kotlin data class named `Course`
- Displays a list of courses using `RecyclerView`
- Implements `Adapter` and `ViewHolder`
- Handles click events for each course item
- Opens `DetailActivity` when a course item is selected
- Passes data using `Intent` extras
- Displays course information on the detail screen
- Includes 6 initial courses to satisfy assignment requirements
- Allows users to add new courses dynamically

## Project Files
- `MainActivity.kt` – manages user input, initial data, RecyclerView setup, and adding new courses
- `DetailActivity.kt` – displays the selected course details
- `Course.kt` – data class representing a course object
- `CourseAdapter.kt` – binds course data to RecyclerView items and handles click events
- `activity_main.xml` – layout for the main screen
- `activity_detail.xml` – layout for the detail screen
- `AndroidManifest.xml` – declares app activities and launcher activity

## How the App Works
1. The app launches into `MainActivity`.
2. Six sample courses are loaded into the list.
3. The user can enter a course code, course name, and course description.
4. When the **Add Course** button is clicked, the new course is added to the RecyclerView.
5. When the user taps on any course item, the app opens `DetailActivity`.
6. The selected course data is passed through Intent extras and displayed on the detail screen.

## Technologies Used
- Kotlin
- Android Studio
- RecyclerView
- Intent
- XML Layouts
- Android SDK

## Concepts Demonstrated
This project demonstrates:
- Kotlin class and data class creation
- RecyclerView implementation
- Adapter and ViewHolder pattern
- Click event handling
- Activity navigation
- Passing data between activities
- Basic input validation
- Dynamic list updates using `notifyItemInserted()`

## Learning Outcome
Through this assignment, the following Android development concepts were practiced:
- Designing user interfaces with XML
- Handling user input through `EditText`
- Displaying structured data using RecyclerView
- Navigating between screens in Android
- Using Intent extras for data transfer
- Writing documented and organized Kotlin code
- Preparing a project for GitHub submission

## Notes
The app is structured to meet the assignment requirements by including:
- a `Course` data class
- at least 6 courses
- RecyclerView
- Adapter and ViewHolder
- click events
- a detail screen
- Intent extras for passing course data

## Author
**Jennyfer Parmar**  
**Student ID:** A00201240
