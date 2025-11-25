import java.util.function.Function;

public class Function_Syntax {
    public static void main(String[] args) {
        Function<String ,Integer> StringLength=s -> s.length();
        System.out.println( StringLength.apply("Hello"));

        Function<Integer ,Integer>square=num->num*num;
        System.out.println(square.apply(5));
    }
}
