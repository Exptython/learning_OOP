
import java.util.Comparator;
import java.util.function.Consumer;

public class Consumer_Syntax {
    public static void main(String[] args) {
        Consumer<String> printer=str-> System.out.println(str);
        printer.accept("hello world!");

        Consumer<Integer> squarePrinter=num-> System.out.println(num+num);
        squarePrinter.accept(5);
    }
}
