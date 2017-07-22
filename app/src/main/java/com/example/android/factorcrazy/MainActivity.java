package com.example.android.factorcrazy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

/**
 * This app displays points for a quiz app.
 */
public class MainActivity extends AppCompatActivity {
    int points = 0;

    // Find all views by ID
    EditText nameEditText;
    EditText questionOne;
    RadioButton questionTwoAnswerA;
    RadioButton questionThreeAnswerA;
    RadioButton questionFourAnswerA;
    RadioButton questionFiveAnswerA;
    CheckBox questionSixAnswerA;
    CheckBox questionSixAnswerB;
    CheckBox questionSixAnswerC;
    CheckBox questionSixAnswerD;
    RadioButton questionSevenAnswerA;
    RadioButton questionEightAnswerA;
    CheckBox questionNineAnswerA;
    CheckBox questionNineAnswerB;
    CheckBox questionNineAnswerC;
    RadioButton questionTenAnswerA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find all views by id
        nameEditText = (EditText) findViewById(R.id.name_field);
        questionOne = (EditText) findViewById(R.id.enter_earth);
        questionTwoAnswerA = (RadioButton) findViewById(R.id.gold_correct);
        questionThreeAnswerA = (RadioButton) findViewById(R.id.ocean_correct);
        questionFourAnswerA = (RadioButton) findViewById(R.id.hell_correct);
        questionFiveAnswerA = (RadioButton) findViewById(R.id.mountain_correct);
        questionSixAnswerA = (CheckBox) findViewById(R.id.answerA_checkbox);
        questionSixAnswerB = (CheckBox) findViewById(R.id.answerB_checkbox);
        questionSixAnswerC = (CheckBox) findViewById(R.id.answerC_checkbox);
        questionSixAnswerD = (CheckBox) findViewById(R.id.answerD_checkbox);
        questionSevenAnswerA = (RadioButton) findViewById(R.id.volcano_correct);
        questionEightAnswerA = (RadioButton) findViewById(R.id.pacific_correct);
        questionNineAnswerA = (CheckBox) findViewById(R.id.saharaA_checkbox);
        questionNineAnswerB = (CheckBox) findViewById(R.id.saharaB_checkbox);
        questionNineAnswerC = (CheckBox) findViewById(R.id.saharaC_checkbox);
        questionTenAnswerA = (RadioButton) findViewById(R.id.reef_correct);
    }

    /**
     * This method is called when question 1 is answered.
     */

    public void questionOneSubmit(View view) {

        if (questionOne.getText().toString().equals(getString(R.string.answer1))) {
            points += 2;
        }
    }

    /**
     * This method is called when question 2 is answered.
     */
    public void questionTwoSubmit(View view) {
        if (questionTwoAnswerA.isChecked()) {
            points += 2;
        }
    }

    /**
     * This method is called when question 3 is answered.
     */
    public void questionThreeSubmit(View view) {
        if (questionThreeAnswerA.isChecked()) {
            points += 2;
        }
    }

    /**
     * This method is called when question 4 is answered.
     */
    public void questionFourSubmit(View view) {
        if (questionFourAnswerA.isChecked()) {
            points += 2;
        }
    }


    /**
     * This method is called when question 5 is answered.
     */
    public void questionFiveSubmit(View view) {
        if (questionFiveAnswerA.isChecked()) {
            points += 2;
        }
    }

    /**
     * This method is called when question 6 is answered.
     */
    public void questionSixSubmit(View view) {

        if ((questionSixAnswerA.isChecked()) && (questionSixAnswerB.isChecked()) && (!questionSixAnswerC.isChecked())
                && (!questionSixAnswerD.isChecked())) {
            points += 4;
        }
    }

    /**
     * This method is called when question 7 is answered.
     */
    public void questionSevenSubmit(View view) {
        if (questionSevenAnswerA.isChecked()) {
            points += 2;
        }
    }

    /**
     * This method is called when question 8 is answered.
     */
    public void questionEightSubmit(View view) {
        if (questionEightAnswerA.isChecked()) {
            points += 2;
        }
    }

    /**
     * This method is called when question 9 is answered.
     */
    public void questionNineSubmit(View view) {

        if ((questionNineAnswerA.isChecked()) && (questionNineAnswerB.isChecked())
                && (!questionNineAnswerC.isChecked())) {
            points += 4;
        }
    }

    /**
     * This method is called when question 10 is answered.
     */
    public void questionTenSubmit(View view) {
        if (questionTenAnswerA.isChecked()) {
            points += 2;
        }
    }

    /**
     * This method is called when score button is clicked.
     */
    public void submitPoints(View view) {
        //Name field
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();


        String submitMessage = name + getString(R.string.toast3a) + " " + points + " " + getString(R.string.toast3c);
        String submitMessageTwo = name + getString(R.string.toast3b) + " " + points + " " + getString(R.string.toast3c);

        if (points >= 18)
            // makes Toast with the submitMessage which contains the  score
            Toast.makeText(this, submitMessage, Toast.LENGTH_LONG).show();

        else if (points < 18) {
            Toast.makeText(this, submitMessageTwo, Toast.LENGTH_LONG).show();
        }
    }


    /**
     * This method is called when the reset button is clicked.
     */
    public void resetQuiz(View view) {
        points = 0;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}