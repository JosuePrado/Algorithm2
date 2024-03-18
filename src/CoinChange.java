import java.util.Scanner;

public class CoinChange {

    private static final int[][] memo = new int[5][7489];
    private static final int[] typeCoins = { 1, 5, 10, 25, 50 };

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 0;
        while (n < 3) {
            int cents = input.nextInt();
            fillMemo();
            int totalWays = differentCentsChanges(cents, typeCoins[0]);
            System.out.println(totalWays);
            n++;
        }
    }

    private static void fillMemo() {
        for (int i = 0; i < CoinChange.memo.length; i++) {
            for (int j = 0; j < CoinChange.memo[0].length; j++) {
                CoinChange.memo[i][j] = -1;
            }
        }
    }

    private static int differentCentsChanges(int cents, int typeCoin) {
        if (cents <= 1) return 1;

        if (memo[1][1] != -1) {

        }

        return 0;
    }
}