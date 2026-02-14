package Array;

public class ThirdMaxInAnArray {
    public static void main(String[] args) {
        int a[] = {15,78,98,56,68,12,65};
        int max = a[0];
        int secondMax = a[1];
        int thirdMax = a[2];

        for(int i =0;i < a.length ;i++){
            if(a[i] > max){
                thirdMax = secondMax;
                secondMax = max;
                max = a[i];
            }
            else if(a[i]< max && a[i] < secondMax && a[i] > thirdMax){
                thirdMax = a[i];
            }
        }

        System.out.println(thirdMax);

    }
}
