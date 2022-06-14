package objects;

public class Main {
    public static void main(String[] args) {
    Author author1 = Author.Author("Достоевский", "Федор");
    Book book1 = Book.Book(author1, "Преступление и наказание", 1866);
        System.out.println("author1.getFullName() = " + author1.getLastName() + author1.getFirstName());
        System.out.println("book1.getBookYear() = " + book1.getBookYear());
        book1.setBookYear(2013);
        System.out.println("book1.getBookYear() = " + book1.getBookYear());
        // 2 книга
        System.out.println("2 книга");
        Author author2 = Author.Author("Грибоедов", "Александр");
        Book book2 = Book.Book(author2, "Горе от ума", 1824);
        System.out.println("author1.getFullName() = " + author2.getLastName() + author2.getFirstName());
        System.out.println("book2.getBookName() = " + book2.getBookName());
        System.out.println("book2.getBookYear() = " + book2.getBookYear());



    }
}
