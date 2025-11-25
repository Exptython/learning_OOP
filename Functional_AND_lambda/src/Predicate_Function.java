import java.util.function.Predicate;



public class Predicate_Function {
    public static void main(String[] args) {
        Predicate<String>isLong=str->str.length()>5;
        System.out.println(isLong.test("hello"));
        System.out.println(isLong.test("hello world"));

        Predicate<Integer> isEven=num->num%2==0;
        System.out.println(isEven.test(4));
    }
}
