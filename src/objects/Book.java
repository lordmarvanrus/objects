package objects;

public class Book {
    private String bookName;
    private int year;
    Author author;

    public static Book Book(Author author, String bookName, int year) {
        Book book = new Book();
        book.author = author;
        book.bookName = bookName;
        book.year = year;
        return book;
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


    }



