package com.example.bottomnav.ui.spring;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SpringViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SpringViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("SPRING");
    }

    public LiveData<String> getText() {
        return mText;
    }
}