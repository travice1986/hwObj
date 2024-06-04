import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(lastnameAuthor, author.lastnameAuthor);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor, lastnameAuthor);
    }

}
