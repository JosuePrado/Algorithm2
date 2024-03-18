package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class WaterProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] canisters = new int[n];
        for (int i = 0; i < n; i++) {
            canisters[i] = scanner.nextInt();
        }
        Arrays.sort(canisters);

        int trips = calculateMinTrips(n, k, canisters);

        System.out.println(trips);
    }

    public static int calculateMinTrips(int n, int k, int[] canisters) {
        int trips = 0;
        int i = n - 1;

        while (i >= 0) {
            int totalVolume = 0;

            while (i >= 0 && totalVolume + canisters[i] <= k) {
                totalVolume += canisters[i];
                i--;
            }

            trips++;
            if (totalVolume == 0) {
                System.out.println("Impossible");
                return trips;
            }
        }

        return trips;
    }
}