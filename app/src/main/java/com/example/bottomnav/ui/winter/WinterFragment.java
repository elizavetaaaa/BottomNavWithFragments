package com.example.bottomnav.ui.winter;

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

public class WinterFragment extends Fragment {

    private WinterViewModel winterViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        winterViewModel =
                ViewModelProviders.of(this).get(WinterViewModel.class);
        View root = inflater.inflate(R.layout.fragment_winter, container, false);
        final TextView textView = root.findViewById(R.id.text_winter);
        winterViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}