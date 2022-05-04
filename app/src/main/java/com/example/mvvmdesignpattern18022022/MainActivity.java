package com.example.mvvmdesignpattern18022022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mBtnClick;
    TextView mTv;
    EditText mEdt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnClick = findViewById(R.id.buttonClick);
        mTv = findViewById(R.id.textView);
        mEdt = findViewById(R.id.editText);

    }
}