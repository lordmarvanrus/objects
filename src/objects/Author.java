package objects;

public class Author {
    private String lastName;
    private String firstName;
    private String fullName;

    public Author(String lastName, String firstName) {
        this.fullName = lastName + firstName;
    }
    public String getFullName() {
        return this.fullName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
}
