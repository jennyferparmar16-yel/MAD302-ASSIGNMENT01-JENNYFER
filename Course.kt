/**
 * Course Code: MAD302
 * Assignment: Assignment 1
 * Student Name: Jennyfer Parmar
 * Student ID: A00201240
 * Date of Submission: 2026-03-27
 * Description: Data class representing a Course entity with code, name, and description.
 */

package com.example.mad302_assignment01_jennyfer

/**
 * Represents a single course item.
 * @param code The unique identifier for the course (e.g., MAD302).
 * @param name The full title of the course.
 * @param description A detailed summary of the course content.
 */
data class Course(
    val code: String,
    val name: String,
    val description: String
)