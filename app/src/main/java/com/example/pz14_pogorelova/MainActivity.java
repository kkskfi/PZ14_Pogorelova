package com.example.pz14_pogorelova;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.example.pz14_pogorelova.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.pz14_pogorelova.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
     setContentView(binding.getRoot());

        TextView mTextView = binding.button;
    }
}