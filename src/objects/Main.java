package objects;

public class Main {
    public static void main(String[] args) {
        // 1 книга
        Author author1 = new Author("Достоевский", "Федор");
        Author author3 = new Author("Достоевский", "Федор");
        Book book1 = new Book(author1, "Преступление и наказание", 1866);
        Book book3 = new Book(author1, "Преступление и наказание", 1866);
        // 2 книга
        Author author2 = new Author("Грибоедов", "Александр");
        Book book2 = new Book(author2, "Горе от ума", 1824);
        // Проверка данных
        System.out.println("author1 = " + author1.getLastName() + author1.getFirstName());
        System.out.println("book2.getBookName() = " + book2.getBookName());
        System.out.println("book1.getBookYear() = " + book1.getBookYear());
        book1.setBookYear(2013); // Проверка сеттера
        System.out.println("book1.getBookYear() = " + book1.getBookYear());

        System.out.println("2 книга");
        System.out.println("author1 = " + author2.getLastName() + author2.getFirstName());
        System.out.println("book2.getBookName() = " + book2.getBookName());
        System.out.println("book2.getBookYear() = " + book2.getBookYear());

        System.out.println("author1.toString() = " + author1.toString());
        System.out.println("book1.toString() = " + book1.toString());

        System.out.println("проверка");
        System.out.println(book1.equals(book3));
        System.out.println(author1.equals(author3));

        System.out.println(book1.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(author1.hashCode());
        System.out.println(author3.hashCode());

        System.out.println(author1.hashCode() == author3.hashCode());


    }
}
