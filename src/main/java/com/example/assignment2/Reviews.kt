package com.example.assignment2

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Reviews : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews)

        val reviewText = findViewById<TextView>(R.id.reviewText)

        val myQuestions = listOf(
            "Nelson Mandela was the president in 1994 years",
            "The Berlin wall fell in 1999",
            "World war 2 ended in 1945",
            "The first moon landing was in 1969",
            "The fire of London was in 1960"
        )

        val answers = listOf(
            true,
            false,
            true,
            true,
            true,
        )

        val reviewContent = StringBuilder()
        for (i in myQuestions.indices) {
            reviewContent.append("Question ${i + 1}: ${myQuestions[i]}\n")
            reviewContent.append("Correct answer: ${if (answers[i]) "True" else "False"}\n\n")
        }
        reviewText.text = reviewContent.toString()
    }
}

