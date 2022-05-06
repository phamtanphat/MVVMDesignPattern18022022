package com.example.mvvmdesignpattern18022022;

import android.os.Handler;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MyDatabase {
    private MutableLiveData<String> data = new MutableLiveData<>();

    public LiveData<String> getData(){
        return data;
    }

    public void handleData(){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                String text = "";
                for (int i = 0; i < 5; i++) {
                    text += i + " - ";
                }
                text = text.substring(0 , text.length() - 3);
                data.setValue(text);
            }
        },5000);
    }
}
