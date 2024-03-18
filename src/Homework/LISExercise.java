package Homework;

import java.util.Arrays;

public class LISExercise {

    public static void main (String[] args) {
        int[] a = {6,4,5,2,1,3};
        int max = lis(a);
        System.out.println(max);
    }

    public static int lis (int[] arr) {
        int[] lic = new int[arr.length];
        Arrays.fill(lic, 1);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lic[i] < lic[j] + 1) {
                    lic[i] = lic[j] + 1;
                }
            }
        }

        int max = 0;
        for (int element : lic) {
            max = Math.max(element, max);
        }

        return max;
    }
}
