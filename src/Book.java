import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private final int publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

   @Override
    public String toString() {
        return "Название книги: " + this.title + "\n" + this.author + "\n" + "Год издания: " + this.publishingYear;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, publishingYear, author);
    }
}
