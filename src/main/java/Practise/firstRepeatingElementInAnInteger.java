package Practise;

import java.util.HashMap;
import java.util.HashSet;

public class firstRepeatingElementInAnInteger {
    public static void main(String[] args) {
        int a[] = {10, 5, 3, 4, 3, 5, 10, 3};
        firstRepeat(a, a.length);
    }

    private static void firstRepeat(int[] a, int length) {
        int min = -1;
        HashMap<Integer, Integer> hashSet = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (hashSet.containsKey(a[i])) {
                if (min == -1 || hashSet.get(a[i]) < hashSet.get(a[min])) {
                    min = i;
                }
            } else
                hashSet.put(a[i], i);
        }

        if (min != -1) {
            System.out.println("The first repeating element  " + a[min]);
        } else {
            System.out.println("There is no repeating element.");
        }

    }
}
