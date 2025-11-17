class LibraryBook{
    String bookTitle;
    String author;
    int availableCopies;

    public LibraryBook(String bookTitle,String author,int availableCopies){
        this.bookTitle=bookTitle;
        this.author=author;
        this.availableCopies=availableCopies;

    }
    public void borrowBook(){
        if (availableCopies>0){
            availableCopies--;
            System.out.println("book is available");

        }else {
            System.out.println("out of stock");
        }
    }
    public void DisplayInfo(){
        System.out.println("Book library");
        System.out.println("book title:"+bookTitle);
        System.out.println("Author: "+author);
        System.out.println("availableCopies: "+availableCopies);


    }

}

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("LastBook", "johnAlia", 2);
        book1.DisplayInfo();
        LibraryBook book2 = new LibraryBook("ZoneFight", "MarkOne", 0);

    }
}
