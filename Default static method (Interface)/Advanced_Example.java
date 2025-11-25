
 interface MathOps{
    default int squarePlusOne(int x){
        int sq=square(x);
        return sq+1;
    }
    default int cubeMinusOne(int x){
        int cube =cube(x);
        return cube-1;
    }
    private int square (int x){
        return x*x;
    }
    private int cube(int x){
        return x*x*x;
    }
}
class UseMath implements MathOps{

}
public class Advanced_Example {
    public static void main(String[] args) {
        UseMath um=new UseMath();
        System.out.println(um.squarePlusOne(4));
        System.out.println(um.cubeMinusOne(3));
    }
}

