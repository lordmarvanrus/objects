package objects;

import java.util.Objects;

public class Book {
    private String bookName;
    private int year;
    Author author;

    public Book (Author author, String bookName, int year) {
        this.author = author;
        this.bookName = bookName;
        this.year = year;
    }

    public void setBookYear(int year) {
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookYear() {
        return year;
    }

    public String toString() {
        return "Название: " + bookName + ", " + author.toString() + ", " + "год издания: " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(year, book.year) && Objects.equals(bookName, book.bookName) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, year, author);
    }
}



