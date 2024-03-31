import Homework.stringMatching.FiniteAutomaton;
import Homework.stringMatching.Naive;

import java.util.List;

public class Example {
    public static void main(String[] args) {
        String pattern = "test";
        String text = "this is a test text";
        String alphabet = "test";

        FiniteAutomaton automaton = new FiniteAutomaton(pattern, alphabet);
        System.out.println("Tabla de Transiciones:");
        printTransitionTable(automaton);
        List<Integer> matches = automaton.search(text);
        System.out.println("Matches encontrados en las posiciones: " + matches);
    }

    private static void printTransitionTable(FiniteAutomaton automaton) {
        System.out.print("Estado | ");
        for (char c : automaton.transitionTable[0].keySet()) {
            System.out.print(" " + c + "  | ");
        }
        System.out.println();
        System.out.println("-------------------------------");
        for (int i = 0; i < automaton.transitionTable.length; i++) {
            System.out.print("   " + i + "   | ");
            for (char c : automaton.transitionTable[i].keySet()) {
                System.out.print(" " + automaton.transitionTable[i].get(c) + "  | ");
            }
            System.out.println();
        }
    }
}