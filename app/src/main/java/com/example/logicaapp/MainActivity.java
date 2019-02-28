package com.example.logicaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mFirstAnswer;
    private EditText mSecondAnswer;
    private EditText mThirdAnswer;
    private EditText mFourthAnswer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirstAnswer = findViewById(R.id.EditTextFirstAnswer);
        mSecondAnswer = findViewById(R.id.EditTextSecondAnswer);
        mThirdAnswer = findViewById(R.id.EditTextThirdAnswer);
        mFourthAnswer = findViewById(R.id.EditTextFourthAnswer);
        Button mSubmit = findViewById(R.id.buttonSubmit);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitAnswers();
            }
        });
    }
    private void submitAnswers(){
        String answer1 = mFirstAnswer.getText().toString();
        String answer2 = mSecondAnswer.getText().toString();
        String answer3 = mThirdAnswer.getText().toString();
        String answer4 = mFourthAnswer.getText().toString();
        if(answer1.equals("T") && answer2.equals("F") && answer3.equals("F") && answer4.equals("T")){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }

    }
}
