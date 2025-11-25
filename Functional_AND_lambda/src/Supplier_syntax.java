
import java.util.function.Supplier;


public class Supplier_syntax {
    public static void main(String[] args) {
        Supplier<Double>randomSupplier=()->Math.random();
        System.out.println(randomSupplier.get());

        Supplier<String> greetingSupplier=()->"hello world";
        System.out.println(greetingSupplier.get());
    }
}
