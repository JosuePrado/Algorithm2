package Homework.stringMatching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FiniteAutomaton {
    private final String pattern;
    public final Map<Character, Integer>[] transitionTable;

    public FiniteAutomaton(String pattern, String alphabet) {
        this.pattern = pattern;
        int m = pattern.length();
        int n = alphabet.length();
        this.transitionTable = new HashMap[m + 1];

        for (int i = 0; i <= m; i++) {
            this.transitionTable[i] = new HashMap<>();
            for (int j = 0; j < n; j++) {
                char symbol = alphabet.charAt(j);
                int k = Math.min(m, i + 1);
                while (k > 0) {
                    if (pattern.substring(0, k).equals(pattern.substring(0, i) + symbol)) {
                        break;
                    }
                    k--;
                }
                this.transitionTable[i].put(symbol, k);
            }
        }
    }

    public List<Integer> search(String text) {
        List<Integer> matches = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();
        int q = 0;

        for (int i = 0; i < n; i++) {
            char symbol = text.charAt(i);
            if (transitionTable[q].containsKey(symbol)) {
                q = transitionTable[q].get(symbol);
            } else {
                q = 0;
            }
            if (q == m) {
                matches.add(i - m + 1);
            }
        }

        return matches;
    }

    public static void main(String[] args) {
        String pattern = "aaba";
        String text = "aabaacaadaabaaba";

        FiniteAutomaton automaton = new FiniteAutomaton(pattern, "abc");
        List<Integer> matches = automaton.search(text);
        System.out.println("Matches found at positions: " + matches);
    }
}
