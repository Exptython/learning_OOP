class Book{
    String title;
    String author;

    public Book(String title,String author){
        this.author=author;
        this.title=title;
    }
    public void DisplayInfo(){
        System.out.println("author: "+author);
        System.out.println("title: "+title);
    }
}

public class problem1 {
    static void printBook(Book b){
        b.DisplayInfo();
    }

    public static void main(String[] args) {
        Book b1=new Book("christianoRonaldo","Messi");
        printBook(b1);
    }
}
