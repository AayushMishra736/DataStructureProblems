package Practise;

import java.util.HashMap;

public class CountTheSubArray {
    public static void main(String[] args) {
        int arr[] = {1, 5, 7,-1,6,0};
        int n = arr.length;
        int sum = 6;
        System.out.print("Count of pairs is " + getPairsCount(arr, n, sum));
    }

    private static String getPairsCount(int[] a, int n, int sum) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (hashMap.containsKey(sum - a[i])) {
                count += hashMap.get(sum - a[i]);
            }
            if (hashMap.containsKey(a[i])) {
                hashMap.put(a[i],hashMap.get(a[i] + 1));
            }
            else{
                hashMap.put(a[i],1);
            }
        }
        return "Pair at " + count;
    }

}
