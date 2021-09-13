package UkeENOpp;

public class Oppa {
    public static int min(int[] a) {
        if (a.length < 1) {
            throw new java.util.NoSuchElementException("tabelen er tom");
        }
        int indexMin = a.length - 1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] < a[indexMin]) {
                indexMin = i;
            }
        }
        return indexMin;
    }


    public static void main(String[] args) {
        int[] a = {1, 3, 6, 2, 9, 4, 12, 13};
        System.out.println(min(a));
    }
}
