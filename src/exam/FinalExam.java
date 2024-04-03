package exam;

import java.util.Arrays;

/**
 * Q1. Si el problema tiene sub-problemas que juntos resuleven el problema principal, la mejor opcion seria utilizar un algoritmo greedy,
 *      ya que este tipo de algoritmos buscan la mejor solucion inmediata a los sub-problemas;
 *       tambien se puede usar el enfoque de dynamic programming mas especificamente button-up
 * Q2. EL alfabeto seria: a, b, m, s, x, y, z
 * Q3. El valor de de la funcion en &(2, x) seria 0;
 */
public class FinalExam {

    /**
     * Minimo tiempo de mealsTime
     * Siempre se elige el meal que se tarda menos en comer, siempre y cuando la suma de estos tiempos sea menor o igual al tiempo maximo
     * (6, 3, 2, 4, 1) -> {1, 2, 3, 4, 5, 6} este seria el orden en que se valorarian los items
     * 1 + 2 + 3 + 4 = 10, donde M = 10, entonces (1, 2, 3, 4) -> 4 (size) es la cantidad maxima de meals que se pueden comer en ese tiempo
     *
     * El tiempo de complejidad de la solucion con greedy es de O(n log n) debido al ordenamiento
     */
    public static int foodCompetitionGreedy(int meals, int time, int[] mealsTime) {
      int maxMeals = 0;
      int count = 0;
      Arrays.sort(mealsTime);

      for (int mealTime : mealsTime) {
          if ((count + mealTime) <= time) {
              count += mealTime;
              maxMeals++;
          }
      }

      return maxMeals;
    }

    /**
     * Analyse the problem based on sub-problems
     * Secuencia: m1, m2, ..... mn donde n es la cantidad de meals
     *
     */
    public static int foodCompetitionDp(int meals, int time, int[] mealsTime) {

    }
    public static void main (String[] args) {
        int meals = 2;
        int time = 2;
        int[] mealsTime = {2, 1};

        System.out.println(foodCompetitionGreedy(meals, time, mealsTime));

        time = 18;
        mealsTime = new int[]{3, 1};

        System.out.println(foodCompetitionGreedy(meals, time, mealsTime));

        meals = 5;
        time = 10;
        mealsTime = new int[]{6, 3, 2, 4, 1};

        System.out.println(foodCompetitionGreedy(meals, time, mealsTime));
    }
}
