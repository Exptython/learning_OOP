
class Product{
    String id;
    String name;
    int price;

    Product(String id, String name,int price){
        this.id=id;
        this.price=price;
        this.name=name;
    }
    void displayInfo(){
        System.out.println("----Grocery Store---");
        System.out.println("Id: "+id);
        System.out.println("name: "+name);
        System.out.println("price: "+price);
    }
}
class Electronics extends Product{
    int Warranty;

        Electronics(String id ,String name,int price ,int Warranty){
            super(id,name,price);
            this.Warranty=Warranty;

        }
        void DisplayInfo(){
            super.displayInfo();
            System.out.println("warranty: "+Warranty);
        }
}
class Grocery extends Product{
    int ExpiryDate;
    Grocery(String id,String name,int price,int ExpiryDate){
        super(id,name,price);
        this.ExpiryDate=ExpiryDate;

    }
void DisplayInfo(){
        super.displayInfo();
    System.out.println("ExpiryDate: "+ExpiryDate);
}

}


public class AdvancedProblem1 {
    public static void main(String[] args) {

  Grocery Product1=new Grocery("H2Q144","milk",200,2024)  ;
        Product1.DisplayInfo();
    }
}
