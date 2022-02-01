package com.example.homework;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class diziler extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] personeller = new String[3];
        personeller[0] = "ayse duman" ;
        personeller[1] = "mehmet keskin" ;
        personeller[2] = "ali lutfu" ;
    }
}
