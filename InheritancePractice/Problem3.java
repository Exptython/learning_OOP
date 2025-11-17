class Shape{
    void Area(){
        System.out.println("Area is not defined for generic shape");
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    void Area(){
        double result=Math.PI*radius*radius;
        System.out.println("Area of circle: "+result);
    }
}
class Rectangle extends Shape{
    double length,width;

    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    void Area(){
        double result=length*width;
        System.out.println("Area of rectangle:"+result);
    }

}
public class Problem3 {
    public static void main(String[] args) {
        Circle C1=new Circle(5);
        Rectangle R1=new Rectangle(4,6);

        C1.Area();
        R1.Area();
    }





}
