
interface StringProcessor{
    String process(String text);
}

public class Basic_Example {
    public static void main(String[] args) {
        StringProcessor toUpper=text->text.toUpperCase();
        StringProcessor removeSpaces = text -> text.replace(" ", "");
        StringProcessor reverse = text -> new StringBuilder(text).reverse().toString();


        System.out.println(toUpper.process("hello world"));

        System.out.println(removeSpaces.process("hello world"));
        System.out.println(reverse.process("hello"));
    }
}
