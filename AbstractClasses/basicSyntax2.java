
abstract class Shape{
    abstract  double area();
}
class Circle extends Shape{
    double radius=5;
    double area(){
        return 3.14*radius*radius;
    }
}
class Rectangle extends Shape{
    double w=4;
    double h=6;
    double area(){
        return w*h;
    }
}
public class basicSyntax2 {
    public static void main(String[] args) {
        Shape s=new Circle();
        s.area();
        Shape s1=new Rectangle();
        s1.area();
    }
}
