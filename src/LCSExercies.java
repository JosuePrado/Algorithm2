public class LCSExercies {

    public static void main (String[] args) {

        int max = lcs("abcdef", "asbjcidkelf");
        System.out.println(max);
    }

    private static int lcs(String text1, String text2) {
        int[][] arr = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1 ; i < arr.length ; i ++ ) {
            for (int j = 1 ; j < arr[i].length ; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    arr[i][j] = arr[i-1][j-1] + 1;
                } else {
                    arr[i][j] = Math.max(arr[i][j -1], arr[i - 1][j]);
                }
            }
        }
        return arr[text1.length()][text2.length()];
    }
}
