package my.edu.tarc.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

// variableName : Type
// val = value, var = variable
//E.g. val pi = 3.14159
//E.g. var number : Float

class MainActivity : AppCompatActivity() {
    //Global variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Display the UI
        //R = resources class (res/ folder)
        setContentView(R.layout.activity_main)
        //Link UI to program
        val editTextWeight: EditText = findViewById(R.id.editTextWeight)
        val editTextHeight: EditText = findViewById(R.id.editTextHeight)
        val buttonCalculate: Button = findViewById(R.id.buttonCalculate)
        val textViewBMI: TextView = findViewById(R.id.textViewBMI)

        buttonCalculate.setOnClickListener {
            //To retrieve value from a View
            val weight: Float = editTextWeight.text.toString().toFloat()
            val height: Float = editTextHeight.text.toString().toFloat()

            //BMI = kg/m pow 2
            val bmi = weight/(height/100).pow(2)

            //TODO: Determine the status of BMI and present the result to the user
            //Underweight = <18.5
            //Normal weight = 18.5–24.9
            //Overweight >= 25

            textViewBMI.text = bmi.toString()

        }//end of onClickListener



    }//end of function
}//end of class