package com.example.homework;

import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Listvemap extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //System.out.println("test");
        /* ArrayList<String> isimler = new ArrayList<>();
        isimler.add("ali");
        isimler.add("mehmet");
        isimler.add("derin");
        isimler.add("aysegul");
        System.out.println(isimler.get(0));
        System.out.println(isimler.size());
         */
        Integer[] sayilarim = {10, 20,30,40,55, 70};

        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        sayilar.addAll(Arrays.asList(sayilarim));
        sayilar.add(121);
        sayilar.add(75);
        sayilar.add(757);

        ArrayList<String> meslekler = new ArrayList<>();
        meslekler.add("doktor");
        meslekler.add("yazılım muhendisi");
        meslekler.add("bilgisayar muhendisi");
        meslekler.add("ogretmen");

        //System.out.println(sayilar.get(6));

        //For dongusu ile arraylist kullanımı
        /*for(int i = 0; i < sayilar.size(); i++)
            System.out.println(sayilar.get(i));*/

        //while dongusu ile arraylist kullanımı
        /* int s = 0;
        while (s < sayilar.size()){
            System.out.println(sayilar.get(s));
            s++;
        }*/

        //for each dongusuyle arraylist kullanımı
        /*for(int sayi: sayilar)
            System.out.println(sayi);*/

        //for dongusu
        /*for(int m = 0; m< meslekler.size(); m++)
            System.out.println(meslekler.get(m)); */

       /* Stack<Integer> notlar =new Stack<>();
        notlar.push(80);
        notlar.push(50);
        notlar.push(30);
        notlar.push(99);
        System.out.println(notlar.get(1)); */
        /* for (int i = 0; i < notlar.size(); i++)
            System.out.println(notlar.get(i));
        notlar.remove(notlar.size() - 1);
        for(int i :notlar)
        System.out.println(i); */
        /* int r = notlar.search(30);
        System.out.println(r);

        boolean b = notlar.empty();
        System.out.println(b); */

        HashMap<Integer, String> meyveler = new HashMap<>();
        meyveler.put(1, "muz");
        meyveler.put(2, "kiraz");
        meyveler.put(3, "elma");
        meyveler.put(4, "kivi");

        //System.out.println(meyveler.get(2));
        /* System.out.println(meyveler.size());
        meyveler.clear();
        System.out.println(meyveler.size()); */

        for (Map.Entry meyve : meyveler.entrySet())
        System.out.println(meyve.getKey() + " = " + meyve.getValue());
    }
}
