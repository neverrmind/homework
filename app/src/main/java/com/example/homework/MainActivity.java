package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int sayi1 = 27, sayi2= -15;
        int not1 = 77, not2=56;
        int ortalama = 55, ortalama2;
        ortalama2 = 22;
        int yas;
        yas = 25;
        yas = 12;
        double litre = 2.5;
        litre = 1.5;
        litre = 5;
        double kenar1 = 2.3, kenar2= 5.7;
        float vize = 77.9f, _final = 21.7f;
        byte s1 =50;
        //yorum satırı
        //sayısal veri tipi türleri

        System.out.println("-----integer veri tipi ve degiskenleri");
        System.out.println("sayi1 değişkenin değeri");
        System.out.println(sayi1);

        System.out.println("sayi2 değişkenin değeri");
        System.out.println(sayi2);

        System.out.println("not 1 ve not 2 değişkenin değeri");
        System.out.println(not1);
        System.out.println(not2);

        System.out.println("ortalama1 ve ortalama2 değişkenlernin değeri");
        System.out.println(ortalama);
        System.out.println(ortalama2);

        System.out.println("yas degiskenin degeri");
        System.out.println(yas);

        System.out.println("----double veri tipi ve değişkenleri");
        System.out.println(litre);

        System.out.println(kenar1);
        System.out.println(kenar2);

        System.out.println(vize);
        System.out.println(_final);

        //metinsel veri tipi ver türleri
        char harf ='m';
        char cinsiyet1 = 'e', cinsiyet2;
        cinsiyet2 = 'k';

        System.out.println("char veri tipi ve değişkenleri");
        System.out.println("harf değişkenin değeri");
        System.out.println(harf);

        System.out.println("cinsiyet1 ve cinsiyet2 değişkenlerinin değeri");
        System.out.println(cinsiyet1);
        System.out.println(cinsiyet2);
    }
}