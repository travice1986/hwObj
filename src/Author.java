public class Author {
    private final String nameAuthor;
    private final String lastnameAuthor;

    public Author(String nameAuthor, String lastnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.lastnameAuthor = lastnameAuthor;
    }

    @Override
    public String toString() {
        return "Автор книги: " + this.nameAuthor + " " + this.lastnameAuthor;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) return  false;
        Author that = (Author) other;
        if (!lastnameAuthor.equals(that.lastnameAuthor)) return  false;
        return nameAuthor.equals(that.nameAuthor);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor, lastnameAuthor);
    }

}
