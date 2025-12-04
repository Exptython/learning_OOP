
class Shape{
    void draw(){
        System.out.println("Drawing Shape...");
    }

}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing circle..");
    }
}
class Square extends  Shape{
    void draw(){
        System.out.println("Drawing square..");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Drawing Triangle...");
    }
}
public class Array_Of_Object {
    public static void main(String[] args) {
        Shape[] shapes={new Circle(),new Square(),new Triangle()};

        for (Shape s:shapes)
            s.draw();

    }
}
