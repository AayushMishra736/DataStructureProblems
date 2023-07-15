package Basic25Algorithm;

public class Linearsearch {

    public static void main(String... args){
    int a[] = {10,34,56,54,23,89,9,11};
    int n = a.length;
    int k = 23;
    linearSearch(a,n,k);
    }

    private static void linearSearch(int[] a, int n, int k) {
        for(int i = 0;i < n ;i++){
            if(a[i] == k){
                System.out.println("Position is at " + i);
            }
        }
    }
}
