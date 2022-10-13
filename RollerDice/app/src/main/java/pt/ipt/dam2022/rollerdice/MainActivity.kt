package pt.ipt.dam2022.rollerdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // find our button
        var rollDiceBt: Button = findViewById(R.id.btRollDice)
        // define that the button will react to 'click'
        rollDiceBt.setOnClickListener {
            // add a message to screen when you press the button
            Toast.makeText(this, "The button was pressed", Toast.LENGTH_SHORT).show()
            // generate the dice value
            rollDice()
        }

    }

    /**
     * generate the dice value
     */
    private fun rollDice() {
        // get the dice value
        var randomDiceValue = Random().nextInt(6) + 1 // values from [1; 6]
        // find the textView
        var resultText = findViewById<TextView>(R.id.resultTextView)
        // change the content of TextView
        resultText.text = randomDiceValue.toString()
     
    }
}