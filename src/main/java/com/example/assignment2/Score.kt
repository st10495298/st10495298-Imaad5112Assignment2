import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.assignment2.R
import com.example.assignment2.Reviews

class Score : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        val score = intent.getIntExtra("score", 0)
        val totalQuestions = 5

        val scoreText = findViewById<TextView>(R.id.scoreText)
        val feedbackText = findViewById<TextView>(R.id.feedbackText)
        val reviewButton = findViewById<Button>(R.id.reviewButton)
        val exitButton = findViewById<Button>(R.id.exitButton)

        scoreText.text = "Your score: $score/$totalQuestions"
        feedbackText.text = if (score >= 3) "Great job!" else "Keep practicing!"

        reviewButton.setOnClickListener {
            val intent = Intent(this, Reviews::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finishAffinity() // Close all activities
        }
    }
}