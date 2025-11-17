
class Circle{
    int length;
    int width;

    public Circle(int length, int width){
        this.length=length;
        this.width=width;
    }
    public void DisplayInfo(int area){
        System.out.println("length: "+length);
        System.out.println("width: "+width);
        System.out.println("area:"+area);
    }
}

public class problem2 {
    static void CalculateArea(Circle c){
        c.DisplayInfo(c.length*c.width);
    }

    public static void main(String[] args) {
        Circle c1=new Circle(3,5);
        CalculateArea(c1);
    }
}
