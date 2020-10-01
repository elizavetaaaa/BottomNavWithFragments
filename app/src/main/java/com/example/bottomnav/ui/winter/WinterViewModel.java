package com.example.bottomnav.ui.winter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WinterViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WinterViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("WINTER");
    }

    public LiveData<String> getText() {
        return mText;
    }
}