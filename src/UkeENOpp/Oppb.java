package UkeENOpp;

import java.util.Arrays;

public class Oppb {
    public static int[] minmaks(int[] a) {
        int mi = 0;
        int ma = 0;
        int minVerdi = a[0];
        int maksVerdi = a[0];
        int verdi;

        for (int i = 0; i < a.length; i++) {
            verdi = a[i];
            if (verdi > maksVerdi) {
                maksVerdi = verdi;
                ma = i;
            } else if (verdi < minVerdi) {
                minVerdi = verdi;
                mi = i;
            }
        }
        return new int[]{mi, ma};
    }
    public static long fac(int n){
        long sum = 1;
        for(int i=n; i>0; i--){
            sum *= i;
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] a = {1, 2};
        System.out.println(Arrays.toString(minmaks(a)));
        int n = 4;
        System.out.println(fac(n));
    }
}
