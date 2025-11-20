
class Item{
    protected String title;
    protected boolean isBorrowed;

    public Item(String title){
        this.title=title;
    }
    void borrowItem(){
        isBorrowed=true;
        System.out.println(title + "has been borrowed.");

    }
    void returnItem(){
        isBorrowed=false;
        System.out.println(title+"has been returned.");
    }
}
class Author{
    private String name;
    public Author(String name){
        this.name=name;
    }
    void showAuthor(){
        System.out.println("Author:"+name);
    }
}
class Book extends Item{
    private Author author;
    public Book(String title , Author author){
        super(title);
        this.author=author;
    }
    void showDetails(){
        System.out.println("book:"+ title);
        author.showAuthor();

    }
}
class Magazine extends Item {
    public Magazine(String title) {
        super(title);
    }

    void showDetails() {
        System.out.println("Magazine: " + title);
    }
}
class Library{
    private Item[] items=new Item[3];
    public Library(){
        items[0]=new Book("java",new Author("wahab")); items[1] = new Magazine("Tech Monthly");
        items[2] = new Book("OOP Concepts", new Author("Daniyal "));
    }

    void showLibrary() {
        System.out.println("-- Library Items --");
        for (Item item : items) {
            if (item instanceof Book) {
                ((Book) item).showDetails();
            } else if (item instanceof Magazine) {
                ((Magazine) item).showDetails();
            }
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library li =new Library();
        li.showLibrary();
    }

}
