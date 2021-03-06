package com.example.microcampus.ui.gadget;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.microcampus.MainViewModel;
import com.example.microcampus.R;

import java.util.Objects;

public class GadgetFragment extends Fragment {
    private MainViewModel mainViewModel;
    private View root;
    private Button gotoScore;

    public View onCreateView(@NonNull final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mainViewModel =
                ViewModelProviders.of(Objects.requireNonNull(getActivity())).get(MainViewModel.class);
        root = inflater.inflate(R.layout.fragment_gadget, container, false);

        initVar();

        gotoScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ScoreActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }

    private void initVar() {
        gotoScore = root.findViewById(R.id.gotoScore);
    }
}