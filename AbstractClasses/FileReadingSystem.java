abstract class FileReader{
    String filename;

    FileReader(String filename){
        this.filename=filename;
    }
    abstract void read();
}
class PDFReader extends FileReader{

    PDFReader(String filename){
        super(filename);
    }
    public void read(){
        System.out.println("Reading PDF file: " + filename);
    }
}
class TXTReader extends FileReader {

    TXTReader(String filename) {
        super(filename);
    }

    @Override
    void read() {
        System.out.println("Reading TXT File: " + filename);
    }
}
class DocReader extends FileReader {

    DocReader(String filename) {
        super(filename);
    }

    @Override
    void read() {
        System.out.println("Reading DOC File: " + filename);
    }
}

public class FileReadingSystem {
    public static void main(String[] args) {
        FileReader f1 = new PDFReader("notes.pdf");
        FileReader f2 = new TXTReader("story.txt");
        FileReader f3 = new DocReader("assignment.docx");

        f1.read();
        f2.read();
        f3.read();
    }
}
