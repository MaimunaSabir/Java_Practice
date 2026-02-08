class Book {
    private String title;
    private int year;
    private String author;

    public Book(String t, int y, String a) {
        title = t;
        year = y;
        author = a;
    }

    @Override
    public String toString() {
        return "Title : " + title + "\nYear : " + year + "\nAuthor : " + author;
    }
}

class PrintBook extends Book {
    private String publisher;
    private String isbn;

    public PrintBook(String t, int y, String a, String p, String isbn) {
        super(t, y, a);
        publisher = p;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPublisher : " + publisher + "\nISBN : " + isbn;
    }
}

class AudioBook extends Book {
    private double size;
    private double time;
    private String Artist;

    public AudioBook(String title, int year, String author, double size, double time, String Artist) {
        super(title, year, author);
        this.size = size;
        this.time = time;
        this.Artist = Artist;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSize : " + size + " MB" +
               "\nPlay Length : " + time + " hours" +
               "\nPlayback Artist: " + Artist;
    }
}

public class BookHierarchy {
    public static void main(String[] args) {

        PrintBook printBook = new PrintBook("Namal", 2012,
                "Nimra Ahmed", "Faris", "89-657653");

        AudioBook audioBook = new AudioBook("Pir-e-kamil",
                2005, "Umera Ahmed", 879, 12, "Salar Sikandar");

        System.out.println("Print Book Details:\n" + printBook);
        System.out.println("\nAudio Book Details:\n" + audioBook);
    }
}