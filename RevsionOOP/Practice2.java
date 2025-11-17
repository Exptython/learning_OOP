
class Box{
    int length,width;

    Box(int len,int wid){
        length=len;
        width=wid;
    }

    void showArea(){
        System.out.println("Area: "+(length*width));
    }
}


public class Practice2 {
static void printBox(Box b){
    b.showArea();
}

    public static void main(String[] args) {
        Box b1=new Box(5,6);
        printBox(b1);
    }

}
