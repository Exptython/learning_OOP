class book{
    String title;
    String Author;
    int price;

    public book(String title,String Author,int price){
        this.title=title;
        this.Author=Author;
        this.price=price;

    }

    public void DisplayInfo(){
        System.out.println("Book detail:");
        System.out.println("Title: "+title);
        System.out.println("Author: "+Author);
        System.out.println("price: "+price);
    }
}


public class BookWork {
    public static void main(String[] args) {
        book book1=new book("LastZone","alian",200);
        book1.DisplayInfo();
    }
}
