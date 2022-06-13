package objects;

public class Book {
    private String bookName;
    private String author;
    private int year;

    public Book(String author, String bookName, int year) {
        this.author = author;
        this.bookName = bookName;
        this.year = year;
    }

    public int setBookYear(int year) {
        this.year = year;
        return year;
    }
    public String getBookName () {
        return bookName;
    }
    public int getBookYear () {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    }



