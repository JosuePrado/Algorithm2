package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int giftsNumber = 4;
        String numbers = "1 2 3 4";

        int[] numbersArr = stringToIntArr(numbers, giftsNumber);
        int minimumAmount = lis(numbersArr);
        System.out.println(minimumAmount);
        input.close();
    }

    private static int[] stringToIntArr(String numbers, int giftsNumbers) {
        int[] numberArr = new int[giftsNumbers];
        String[] numbersStr = numbers.split(" ");
        for (int i = 0; i < giftsNumbers; i++) {
            numberArr[i] = Integer.parseInt(numbersStr[i]);
        }
        return numberArr;
    }

    public static int lis (int[] arr) {
        int[] lisArr = new int[arr.length];
        Arrays.fill(lisArr, 1);
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lisArr[i] < lisArr[j] + 1) {
                    lisArr[i] = lisArr[j] + 1;
                }
            }
        }

        int max = 0;
        for (int element : lisArr) {
            max = Math.max(element, max);
        }

        return arr.length - max;
    }
}
