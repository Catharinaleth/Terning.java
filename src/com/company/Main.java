package com.company;
import javax.management.ObjectInstance;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Terning r = new Terning(5);
            System.out.println(r.getSider());

        //Kalder class Terning:
       /** Terning r = new Terning();
        for (int i = 1; i < 7; i++) {
            System.out.println(r.getInt() + i);
        }

        //Kalder metoden Kast:
        Terning t = new Terning();
            System.out.println(t.kast()); // for at få metoden frem på skærmen
    }**/
}
}

