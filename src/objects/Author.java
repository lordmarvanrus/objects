package objects;

public class Author {
    private String lastName;
    private String firstName;

    public static Author Author(String lastName, String firstName) {
        Author author = new Author();
        author.lastName = lastName + " ";
        author.firstName = firstName;
        return author;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
