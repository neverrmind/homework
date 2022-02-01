package com.example.homework;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class kontrolyapilari extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //System.out.println("test");
        //kontrol yapilari

        int a =5, b =4;
        if (a > b){
            System.out.println("a değişkeni b den buyuktur.");
        }
/*
        int sayi = 3;
        switch (sayi){
            case 0:
                System.out.println("sayi degiskeni o a esittir");
                break;
            case 1:
                System.out.println("sayı değişkeni 1e esittir");
                break;
            case 2:
                System.out.println("sayı degiskeni 2ye esittir");
                break;

            default:
                System.out.println("sayı degiskeni yukardaki sartları saglamadı");
                break;
        }
        */

    }
}
