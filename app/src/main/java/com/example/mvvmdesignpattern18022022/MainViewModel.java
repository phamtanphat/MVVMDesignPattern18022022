package com.example.mvvmdesignpattern18022022;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private MutableLiveData<String> text = new MutableLiveData<>();

    public MainViewModel(){

    }

    public LiveData<String> getText(){
        return text;
    }

    public void updateText(String newText){
        text.setValue(newText);
    }
}
