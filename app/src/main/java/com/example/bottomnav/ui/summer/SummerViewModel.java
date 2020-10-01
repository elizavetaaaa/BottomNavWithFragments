package com.example.bottomnav.ui.summer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SummerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SummerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("SUMMER");
    }

    public LiveData<String> getText() {
        return mText;
    }
}