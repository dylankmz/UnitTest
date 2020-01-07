package be.jadv.util;

public class MyHelperClass {

    public static double add2Numbers (double getal1, double getal2) {

        if (getal1 < 0 || getal2 < 0) {
            return -150;
        }

        return getal1 + getal2;
    }

}
