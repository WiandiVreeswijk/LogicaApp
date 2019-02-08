package com.example.logicaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mFirstAnswer;
    private EditText mSecondAnswer;
    private EditText mThirdAnswer;
    private EditText mFourthAnswer;
    private Button mSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFirstAnswer = findViewById(R.id.EditTextFirstAnswer);
        mSecondAnswer = findViewById(R.id.EditTextSecondAnswer);
        mThirdAnswer = findViewById(R.id.EditTextThirdAnswer);
        mThirdAnswer = findViewById(R.id.EditTextFourthAnswer);
        mSubmit = findViewById(R.id.buttonSubmit);
    }
}
