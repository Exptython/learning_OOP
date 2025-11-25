
import java.util.*;
import java.util.function.*;


public class MethodReference_syntax {
    public static void main(String[] args) {
        List<String>name=Arrays.asList("John","wahab","alice" , "bob", "diana");
        name.forEach(System.out::println);
        name.sort(String::compareToIgnoreCase);

        Supplier<List<String>>listSupplier=ArrayList::new;
        List<String>newList=listSupplier.get();

    }
}
