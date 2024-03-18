import java.util.function.Function;

public class Example {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = getSquareFunction();

        int result = squareFunction.apply(5);
        System.out.println("El cuadrado de 5 es: " + result);
    }

    public static Function<Integer, Integer> getSquareFunction() {
        return (Integer x) -> x * x;
    }
}