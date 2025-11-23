
interface Shape{
    double area();
}
class circle implements Shape{
    double radius;

    circle(double radius){
        this.radius=radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
public class BasicSyntax2 {
    public static void main(String[] args) {
        Shape s=new circle(5);
        System.out.println("area of circle: "+s.area());
    }
}
