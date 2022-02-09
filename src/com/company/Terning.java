package com.company;
import java.util.Random;

public class Terning {
    // et slag, som har en defualt på 0:
    int slag;
    int sider;
    /**int side1;
    int side2;
    int side3;
    int side4; **/

    public Terning(int antalSider) {   //konstruktør med parameter
        sider = antalSider;
        /** side1 = a;
         side2 = b;
         side3 = c;
         side4 = d;   **/
    }
    //Definerer en metode for et random kast:
     int kast() { // kan også hedde public static int etc..
        Random r = new Random();
        int random = r.nextInt(6);
           return random;
    }

    //metode som returnere slag værdien
    int getInt() {
        return slag;
    }

    int getSider() {
        return sider;
       // return side1 + side2 + side3 + side4;
    }

}



