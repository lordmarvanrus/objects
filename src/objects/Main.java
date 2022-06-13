package objects;

public class Main {
    public static void main(String[] args) {
    Author author1 = new Author("Достоевский ", "Михаил");
    Book book1 = new Book(author1.getFullName(), "Преступление и наказание", 1866);
        System.out.println("author1.getFullName() = " + author1.getFullName());
        System.out.println("book1.getAuthor() = " + book1.getAuthor());
        System.out.println("book1.getBookYear() = " + book1.getBookYear());
        book1.setBookYear(2013);
        System.out.println("book1.getBookYear() = " + book1.getBookYear());
        System.out.println("2 книга");
        Author author2 = new Author("Грибоедов ", "Александр");
        Book book2 = new Book(author2.getFullName(), "Горе от ума", 1824);
        System.out.println("book2.getBookName() = " + book2.getBookName());
        System.out.println("book2.getBookYear() = " + book2.getBookYear());
        System.out.println("book2.getAuthor() = " + book2.getAuthor());


    }
}
