package com.example.bottomnav.ui.autumn;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AutumnViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AutumnViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("AUTUMN");
    }

    public LiveData<String> getText() {
        return mText;
    }
}