class LibraryItem {
    private String title;
    private String itemId;
    private boolean isCheckedOut;  // Fixed variable name

    public LibraryItem(String title, String itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isCheckedOut = false;  // Fixed variable name
    }

    public String getTitle() {
        return title;
    }

    public String getItemId() {
        return itemId;  // Fixed: was returning title instead of itemId
    }

    public boolean isCheckedOut() {  // Fixed method name
        return isCheckedOut;
    }

    public void checkOut() {
        if (!isCheckedOut) {  // Fixed variable name
            isCheckedOut = true;  // Fixed variable name
            System.out.println(title + " has been checked out");
        } else {
            System.out.println(title + " is already checked out");
        }
    }

    public void returnItem() {
        if (isCheckedOut) {  // Fixed variable name
            isCheckedOut = false;  // Fixed variable name
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " is not checked out.");
        }
    }

    public String toString() {
        return "ID: " + itemId + ", Title: " + title + ", CheckedOut: " + isCheckedOut;  // Added spaces for better formatting
    }
}

class Book extends LibraryItem {
    private String author;
    private int pageCount;

    public Book(String title, String itemId, String author, int pageCount) {
        super(title, itemId);
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount(){
        return pageCount;
    }

    public String toString(){
        return super.toString() + ", Author: " + author + ", pages: " + pageCount;  // Added space
    }
}

class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String title, String itemId, String director, int duration) {
        super(title, itemId);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector(){
        return director;
    }

    public int getDuration(){
        return duration;
    }

    public String toString(){
        return super.toString() + ", Director: " + director + ", duration: " + duration;  // Added space
    }
}

class Magazine extends LibraryItem {
    private String publisher;
    private int issueNumber;

    public Magazine(String title, String itemId, String publisher, int issueNumber) {  // Fixed parameter name from itemID to itemId
        super(title, itemId);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getIssueNumber(){
        return issueNumber;
    }

    public String toString(){
        return super.toString() + ", publisher: " + publisher + ", Issue: " + issueNumber;  // Added space
    }
}

public class BasicQs01 {
    public static void main(String[] args) {
        Book b1 = new Book("The LastZone", "B001", "f.john", 218);
        DVD d1 = new DVD("Avengers", "D001", "ChristianLord", 148);
        Magazine mg = new Magazine("wahabDon", "T001", "SufiyanLord", 921);

        System.out.println("====Library Item====");
        System.out.println(b1);
        System.out.println(d1);
        System.out.println(mg);

        System.out.println("=====Checking Out Item===");
        b1.checkOut();
        d1.checkOut();
        mg.checkOut();

        System.out.println("=====Returning Item====");
        b1.returnItem();
        mg.returnItem();

        System.out.println("====Final status===");
        System.out.println(b1);
        System.out.println(d1);
        System.out.println(mg);
    }
}