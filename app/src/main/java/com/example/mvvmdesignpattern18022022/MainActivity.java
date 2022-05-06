package com.example.mvvmdesignpattern18022022;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

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
//    MyService myService;
//    MyDatabase myDatabase;
    MainViewModel mainViewModel;
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

        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        mainViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                mTv.setText(s);
            }
        });

        mBtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = mEdt.getText().toString();
                mainViewModel.updateText(text);
                mTv.setText(text);
            }
        });
    }

}