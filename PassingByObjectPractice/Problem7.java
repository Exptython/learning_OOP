
class Product{
    String name;
    int price;

    public Product(String name,int price){
        this.name=name;
        this.price=price;
    }
    public void DisplayInfo(){
        System.out.println("Product name:"+name);
        System.out.println("price: "+price);
    }
}

public class Problem7 {
    static Product AddDiscount(Product p,double discountPercentage){
        double discountAmount=p.price*(discountPercentage/100);
        return p;
    }

    public static void main(String[] args) {
        Product p1=new Product("laptop",1000);
        System.out.println("before Discount");
        p1.DisplayInfo();

        Product update=AddDiscount(p1,10);
        System.out.println("After Discount");
        update.DisplayInfo();
    }


}
