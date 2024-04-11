public class Author {
    private final String nameAuthor;
    private final String lastnameAuthor;

    public Author(String nameAuthor, String lastnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.lastnameAuthor = lastnameAuthor;
    }
    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getLastnameAuthor() {
        return this.lastnameAuthor;
    }
}
