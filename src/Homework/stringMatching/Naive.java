package Homework.stringMatching;

public class Naive {

    public String naive (String text, String pattern) {
        char[] textArr = text.toCharArray();
        char[] patternArr = pattern.toCharArray();

        int n = textArr.length;
        int m = patternArr.length;
        boolean isPattern;

        if ( n < m ) {
            return "Pattern not found in the text";
        }

        for (int i = 0; i <= n-m ; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Comparing characters: " + patternArr[j] + " and " + textArr[j + i]);
                isPattern = patternArr[j] == textArr[j + i];

                if (!isPattern) {
                    break;
                }
                if (j == (m - 1)) {
                    System.out.println("Pattern found at index: " + (i + j));
                }
            }
        }

        return "end";
    }
}
