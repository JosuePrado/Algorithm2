package Homework.finalParcial;

import java.util.ArrayList;

public class ChocolateTable {

    public static int maximumNumberOfChocolates(int n) {
        ArrayList<Integer> pieces = new ArrayList<>();

        int i = 1;
        int count = 0;
        while ((n - count) > count) {
            count += i;
            pieces.add(i);
            i++;
        }

        pieces.add(n - count);

        verifyMaximinNumber(pieces);
        return pieces.size();
    }

    private static void verifyMaximinNumber(ArrayList<Integer> pieces) {
        int lastValue = pieces.remove(pieces.size() - 1);

        if (pieces.contains(lastValue)) {
            int value = pieces.remove(pieces.size() - 1);
            pieces.add(value + lastValue);
        } else {
            pieces.add(lastValue);
        }
    }

    public static int dynamicSolution(int N) {
        int[] dp = new int[N + 1];
        dp[0] = 0;

        for (int i = 1; i <= N; i++) {
            dp[i] = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], dp[i - j] + 1);
            }
        }

        return dp[N];
    }

    public static int greedySolution(int n) {
        ArrayList<Integer> pieces = new ArrayList<>();

        int i = 1;
        int count = 0;
        while ((n - count) > count) {
            count += i;
            pieces.add(i);
            i++;
        }
        pieces.add(n - count);
        return pieces.size();
    }

    public static void main(String[] args) {
        int N = 8;
        int result = maximumNumberOfChocolates(N);
        System.out.println("My Solution: " + result);
        result = dynamicSolution(N);
        System.out.println("Dynamic Programming: " +  result );
        result = greedySolution(N);
        System.out.println("Greedy Solution: " + result);
    }
}
