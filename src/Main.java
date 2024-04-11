public class Main {
    public static void main(String[] args) {
        Author bookOne = new Author("Фёдор", "Достоевский");
        Book book = new Book("Идиот", bookOne, 2016);
        book.setPublishingYear(2024);
        System.out.println("Название книги: " + book.getTitle());
        System.out.println("Автор книги: " + book.getAuthor().nameAuthor + " " + book.getAuthor().lastnameAuthor);
        System.out.println("Год издания: " + book.getPublisherYear());

        System.out.println();

        Author bookTwo = new Author("Лев", "Толстой");
        Book bookNew = new Book("Анна Каренина", bookTwo, 2013);
        bookNew.setPublishingYear(2023);
        System.out.println("Название книги: " + bookNew.getTitle());
        System.out.println("Автор книги: " + bookNew.getAuthor().nameAuthor + " " + bookNew.getAuthor().lastnameAuthor);
        System.out.println("Год издания: " + bookNew.getPublisherYear());

    }
}