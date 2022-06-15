package objects;

import java.util.Objects;

public class Author {
    private String lastName;
    private String firstName;

    public static Author Author(String lastName, String firstName) {
        Author author = new Author();
        author.lastName = lastName;
        author.firstName = firstName;
        return author;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return "Автор книги: " + firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        Author otherAuthor = (Author) obj;
        return this.lastName == otherAuthor.lastName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }
}
