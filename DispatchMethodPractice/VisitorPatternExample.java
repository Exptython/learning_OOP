
import java.util.*;

// Element interface
interface DocumentElement {
    void accept(Visitor visitor);
}

// Concrete elements
class Paragraph implements DocumentElement {
    private String content;

    public Paragraph(String content) {
        this.content = content;
    }

    public String getContent() { return content; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Dynamic dispatch + overloading
    }
}

class Image implements DocumentElement {
    private String src;
    private int width, height;

    public Image(String src, int width, int height) {
        this.src = src;
        this.width = width;
        this.height = height;
    }

    public String getSrc() { return src; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Dynamic dispatch + overloading
    }
}

class Table implements DocumentElement {
    private int rows, columns;

    public Table(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows() { return rows; }
    public int getColumns() { return columns; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this); // Dynamic dispatch + overloading
    }
}

// Visitor interface
interface Visitor {
    void visit(Paragraph paragraph);
    void visit(Image image);
    void visit(Table table);
}

// Concrete visitors
class HTMLExporter implements Visitor {
    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("<p>" + paragraph.getContent() + "</p>");
    }

    @Override
    public void visit(Image image) {
        System.out.printf("<img src=\"%s\" width=\"%d\" height=\"%d\"/>\n",
                image.getSrc(), image.getWidth(), image.getHeight());
    }

    @Override
    public void visit(Table table) {
        System.out.printf("<table rows=\"%d\" columns=\"%d\">Table content</table>\n",
                table.getRows(), table.getColumns());
    }
}

class WordCountVisitor implements Visitor {
    private int wordCount = 0;

    @Override
    public void visit(Paragraph paragraph) {
        wordCount += paragraph.getContent().split("\\s+").length;
    }

    @Override
    public void visit(Image image) {
        // Images don't contribute to word count
    }

    @Override
    public void visit(Table table) {
        // Tables might have content, but we'll keep it simple
        wordCount += table.getRows() * table.getColumns();
    }

    public int getWordCount() { return wordCount; }
}

public class VisitorPatternExample {
    public static void main(String[] args) {
        List<DocumentElement> document = Arrays.asList(
                new Paragraph("This is the first paragraph with some text."),
                new Image("photo.jpg", 800, 600),
                new Paragraph("Another paragraph here."),
                new Table(3, 4)
        );

        // HTML Export
        HTMLExporter htmlExporter = new HTMLExporter();
        System.out.println("HTML Export:");
        for (DocumentElement element : document) {
            element.accept(htmlExporter); // Double dispatch
        }

        // Word Count
        WordCountVisitor wordCounter = new WordCountVisitor();
        for (DocumentElement element : document) {
            element.accept(wordCounter); // Double dispatch
        }
        System.out.println("\nTotal word count: " + wordCounter.getWordCount());
    }
}