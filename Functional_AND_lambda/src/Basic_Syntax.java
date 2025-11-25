

interface Calculator{
    int operator(int a,int b);
}

public class Basic_Syntax {
    public static void main(String[] args) {
        Calculator add=(a,b)->a + b;
        Calculator multiply = (a, b) -> a * b;
        Calculator subtract = (a, b) -> a - b;

        System.out.println("5 + 3 = " + add.operator(5, 3));
        System.out.println("5 * 3 = " + multiply.operator(5, 3));
        System.out.println("5 - 3 = " + subtract.operator(5, 3));

    }
}
