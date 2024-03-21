package exam;

import java.util.Arrays;

/**
 * 1. El pre-procesado nos permite evitar comparaciones innecesarias usando diferentes tecnicas dependiendo del algoritmo
 *  (E.j. en rabin karp se usa el valor hash), ya que usa una operacion con un menor costo para ir comparando el pattern con el texto
 *  y solo ir a la comparacion directa entre caracteres para comprobar los casos positovos de matching;
 *  lo cual reduce el tiempo de complejidad ademas de la frecuencia de que suceda el peor caso
 *
 * 2. Los siguientes pasos se usan para encontrar todas las ocurrencias de P en T:
 *  a) Calcular el valor hash de P con un algoritmo de hashing eficiente
 *  b) Ir calculando los valores hash tomando subStrings de T que sea del mismo taman~o de P con el mismo algoritmo de hash
 *  c) ir comparando los valores de los subStrings de T con el valor de P
 *  d) En los casos en que los valores de un subString de T sea igual al de P, se debe comparar los caracteres de ese subString con los de P
 *      para evitar los falsos positivos
 *  e) Si los caracteres son iguales an~adir ese subString a la respuesta del matching
 *  f) Repetir el proceso hasta que no queden subString de T del taman~o de P
 *
 * 3. Es necesario hacer un formal proof al algoritmo greedy, para verificar si el problema cumple las condiciones para ser resuelto de forma eficiente
 * con un enfoque greedy, y que no halla algoritmos mucho mas optimos y si los hay, que sean por un pequen~o margen.
 */
public class Exam2 {
    public static int exam2 (int i, String repacking, String delivery) {
        String[] repackingValues = repacking.split(" ");
        String[] deliveryValues = delivery.split(" ");
        int[] repackingInt = toInt(repackingValues);
        int[] deliveryInt = toInt(deliveryValues);


        return 0;
    }

    private static int[] toInt(String[] strings) {
        int[] intValue = new int[strings.length];

        for (int i = 0; i < strings.length; i++) {
            int valueInt = Integer.parseInt(strings[i]);
            intValue[i] = valueInt;
        }

        return intValue;
    }
}
