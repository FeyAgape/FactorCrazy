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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when question 1 is answered.
     */
    public void submitAnswer(View view) {
        EditText enterAnswer = (EditText) findViewById(R.id.enter_earth);
        // Show a message as a toast
        // Toast.makeText(this, getString(R.string.toast1), Toast.LENGTH_LONG).show();
        // Exit this method early because there's nothing left to do

        String yourAnswer = enterAnswer.getText().toString();
        String earth = getString(R.string.answer1);
        if (yourAnswer.equals(getString(R.string.answer1)))
            points = points + 2;
    }

    /**
     * This method is called when question 2 is answered.
     */
    public void goldRadio(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.gold_correct:
                if (checked)
                    points = points + 2;
                break;
            case R.id.gold_wrong:
                if (checked)
                    break;
        }

    }

    /**
     * This method is called when question 3 is answered.
     */
    public void oceanRadio(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.ocean_correct:
                if (checked)
                    points = points + 2;
                break;
            case R.id.ocean_wrong:
                if (checked)
                    break;
        }

    }

    /**
     * This method is called when question 4 is answered.
     */
    public void hellRadio(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.hell_correct:
                if (checked)
                    points = points + 2;
                break;
            case R.id.hell_wrong:
                if (checked)
                    break;
        }
    }

    /**
     * This method is called when question 5 is answered.
     */
    public void mountainRadio(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.mountain_correct:
                if (checked)
                    points = points + 2;
                break;
            case R.id.mountain_wrong:
                if (checked)
                    break;
        }
    }

    /**
     * This method is called when question 6 is answered.
     */
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Show a message as a toast
        Toast.makeText(this, getString(R.string.toast2), Toast.LENGTH_SHORT).show();
        // Exit this method early because there's nothing left to do

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.answerA_checkbox: {
                if (checked)
                    points = points + 2;
                // Add two points

                break;
            }
            case R.id.answerB_checkbox: {
                if (checked)
                    points = points + 2;
                break;
            }
        }

    }

    /**
     * This method is called when question 7 is answered.
     */
    public void volcanoRadio(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.volcano_correct:
                if (checked)
                    points = points + 2;
                break;
            case R.id.volcano_wrong:
                if (checked)
                    break;
        }

    }

    /**
     * This method is called when question 8 is answered.
     */
    public void pacificRadio(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.pacific_correct:
                if (checked)
                    points = points + 2;
                break;
            case R.id.pacific_wrong:
                if (checked)
                    break;
        }

    }

    /**
     * This method is called when question 9 is answered.
     */
    public void saharaCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Show a message as a toast
        Toast.makeText(this, getString(R.string.toast2), Toast.LENGTH_SHORT).show();
        // Exit this method early because there's nothing left to do

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.saharaA_checkbox:
                if (checked)
                    points = points + 2;
                // Add two points
                break;
            case R.id.saharaB_checkbox:
                if (checked)
                    points = points + 2;
                // Add two points
                break;
        }

    }

    /**
     * This method is called when question 10 is answered.
     */
    public void reefRadio(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.reef_correct:
                if (checked)
                    points = points + 2;
                break;
            case R.id.reef_wrong:
                if (checked)
                    break;
        }
    }

    /**
     * This method is called when score button is clicked.
     */
    public void submitPoints(View view) {
        //Name field
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        String submitMessage = name + getString(R.string.toast3a) + " " + points + " " + getString(R.string.toast3b);
        // makes Toast with the submitMessage which contains the  score
        Toast.makeText(this, submitMessage, Toast.LENGTH_LONG).show();
    }

    /**
     * This method is called when the button is clicked.
     */
    public void resetQuiz(View view) {
        points = 0;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}