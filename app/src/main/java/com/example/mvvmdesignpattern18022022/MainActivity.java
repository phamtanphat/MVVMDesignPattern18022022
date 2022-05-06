package com.example.mvvmdesignpattern18022022;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button mBtnClick;
    TextView mTv;
    EditText mEdt;
    String mText;
//    MyService myService;
    MyDatabase myDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        myService = new MyService(getLifecycle(), new MyService.CallBack() {
//            @Override
//            public void onListen(String lifecycle) {
//                Log.d("BBB",lifecycle);
//            }
//        });
//        getLifecycle().addObserver(myService);

//        myDatabase = new MyDatabase();
//
//        myDatabase.getData().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                Log.d("BBB",s);
//            }
//        });
//
//        myDatabase.handleData();

        mBtnClick = findViewById(R.id.buttonClick);
        mTv = findViewById(R.id.textView);
        mEdt = findViewById(R.id.editText);

        if (savedInstanceState != null){
            String text = savedInstanceState.getString("text");
            mTv.setText(text);
        }
        mBtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mText = mEdt.getText().toString();
                mTv.setText(mText);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",mText);
    }
}