/**
 * Course Code: MAD302
 * Assignment: Assignment 1
 * Student Name: Jennyfer Parmar
 * Student ID: A00201240
 * Date of Submission: 2026-03-27
 * Description: Adapter class to manage the RecyclerView and handle item click events.
 */

package com.example.mad302_assignment01_jennyfer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class CourseAdapter(
    private val courseList: List<Course>,
    private val onItemClick: (Course) -> Unit // Lambda for click handling
) : RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    /**
     * ViewHolder class to provide references to the views for each data item.
     */
    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Using standard Android simple_list_item_2 IDs (text1 and text2)
        val nameTextView: TextView = itemView.findViewById(android.R.id.text1)
        val codeTextView: TextView = itemView.findViewById(android.R.id.text2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        // Inflating the layout for each row
        val view = LayoutInflater.from(parent.context)
            .inflate(android.R.layout.simple_list_item_2, parent, false)
        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = courseList[position]
        holder.nameTextView.text = course.name
        holder.codeTextView.text = course.code

        // Setting the click listener for the specific item
        holder.itemView.setOnClickListener { onItemClick(course) }
    }

    override fun getItemCount(): Int = courseList.size
}