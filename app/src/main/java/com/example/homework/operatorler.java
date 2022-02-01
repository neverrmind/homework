package com.example.homework;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class operatorler  extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //System.out.println("test");
        //aritmetiksel operatorler
        /*
        =
        +
        -
        *
        /
        ++ ilgili değişkenin değerini bir arttrma
        --
         */

        int sayi1 = 5, sayi2 = 28, toplam;
        System.out.println(sayi1);
        System.out.println(sayi1 + 15);
        toplam = sayi1 + sayi2;
        System.out.println(toplam);

        double vize = 27.2, _final = 77.9, sonuc;
        sonuc = vize + _final;
        System.out.println(sonuc);
        vize +=15.9;
        _final -= 17.2;
        sonuc = vize + _final;
        System.out.println(sonuc);

        String isim = "abc";
        System.out.println(isim + 5);



    }
}
