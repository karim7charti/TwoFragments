package com.example.twoFragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class TwoFragments extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two_fragments);

        Button firstFragmentButton = findViewById(R.id.firstFragmentButton);
        Button secondFragmentButton = findViewById(R.id.secondFragmentButton);

        firstFragmentButton.setOnClickListener(v -> loadFragment(new FirstFragment()));

        secondFragmentButton.setOnClickListener(v -> loadFragment(new SecondFragment()));
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
