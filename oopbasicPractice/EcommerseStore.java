
class CartItem{
    String productName;
    int unitPrice;
    int quantity;

    public CartItem(String productName,int unitPrice,int quantity){
        this.productName=productName;
        this.unitPrice=unitPrice;
        this.quantity=quantity;

    }

    public int calculateTotal(){
       int TotalPrice=unitPrice*quantity;
       return TotalPrice;
    }
    public void DisplayInfo(){
        System.out.println("Your Total bill is ");
        System.out.println("Product name: "+productName);
        System.out.println("UnitPrice: "+unitPrice);
        System.out.println("quantity: "+quantity);
        System.out.println("total bill is:"+calculateTotal());

    }

}

public class EcommerseStore {
    public static void main(String[] args) {
        CartItem Item1=new CartItem("milk powder",120,3);
        Item1.DisplayInfo();


    }
}
