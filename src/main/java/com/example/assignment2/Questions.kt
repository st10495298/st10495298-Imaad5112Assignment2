package com.example.assignment2


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.color.utilities.Score

class Questions : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val Qtext = findViewById<TextView>(R.id.QuestionTextView)
        val truebutton = findViewById<Button>(R.id.trueButton)
        val falsebutton = findViewById<Button>(R.id.falseButton)
        val nextbutton = findViewById<Button>(R.id.nextButton)
        val feedb = findViewById<TextView>(R.id.feedbackTextView)

        val myquestions = listOf(
            "Nelson Mandela was the president in 1994",
            "The Berlin wall fell in 1999",
            "World War 2 ended in 1945",
            "The first moon landing was in 1969",
            "The fire of London was in 1666",

        )
        val answers= listOf(
            true,
            false,
            true,
            true,
            true
        )
        var currentnumber = 0
        Qtext.text = myquestions[currentnumber]
        var score = 0
        truebutton.setOnClickListener{
            if(answers[currentnumber]){
                score++
                feedb.text = "Correct Answer!"
            }else {
              feedb.text =  "Incorrect answer"

            }
        }
        falsebutton.setOnClickListener{
            if(!answers[currentnumber]){
                score++
                feedb.text = "Correct Answer!"
            }else {
                feedb.text =  "Incorrect answer"

            }
        }

        nextbutton.setOnClickListener {
            currentnumber++
            if (currentnumber <myquestions.size) {
                Qtext.text = myquestions[currentnumber]
            } else {
                val intent = Intent(this, Score::class.java)
                intent.putExtra("score", score)
                intent.putExtra("total", 5)
                startActivity(intent)
            }
        }
    }

}


