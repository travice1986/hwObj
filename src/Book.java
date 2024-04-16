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
        return "Название книги: " + this.title + "\n" +
                "Автор книги: " + this.author + "\n" + "Год издания: " + this.publishingYear;
   }

   @Override
    public boolean equals(Object other) {
       if (other == null || getClass() != other.getClass()) return  false;
       Book that = (Book) other;
       if (publishingYear != that.publishingYear) return  false;
       return title.equals(that.title);
   }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, publishingYear);
    }
}
