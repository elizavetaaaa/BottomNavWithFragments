package com.example.bottomnav.ui.autumn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.bottomnav.R;

public class AutumnFragment extends Fragment {

    private AutumnViewModel autumndViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        autumndViewModel =
                ViewModelProviders.of(this).get(AutumnViewModel.class);
        View root = inflater.inflate(R.layout.fragment_autumn, container, false);
        final TextView textView = root.findViewById(R.id.text_autumn);
        autumndViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}