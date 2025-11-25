import java.util.*;
import java.util.function.*;


class Product{
    String name;
    double price;
    String category;

    Product(String name,double price,String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }
    public String toString(){
        return name+"- $"+price;
    }
}

public class RealWorld_Example {
    public static void main(String[] args) {
        List<Product> products=Arrays.asList(
                new Product("laptop",999.99,"Electronic"),
                new Product("coffee",4.99,"food"),
                new Product("Phone", 699.99, "Electronics"),
                new Product("Book", 14.99, "Education")
        );

        Predicate<Product>isElectronic=
                Product->"Electronic".equals(Product.category);

        Function<Product,Product>applyDiscount=
                product -> {
            product.price*=0.9;
            return product;
                };
        Consumer<Product> printProduct=
                System.out::println;

        products.stream().filter(isElectronic)
                .map(applyDiscount)
                .forEach(printProduct);

    }
}
