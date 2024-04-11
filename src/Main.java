public class Main {
    public static void main(String[] args) {
        Author bookOne = new Author("Фёдор", "Достоевский");
        Book book = new Book("Идиот", bookOne, 2016);
        book.setPublishingYear(2024);
        System.out.println("Название книги: " + book.getTitle());
        String name = bookOne.getNameAuthor();
        String lastname = bookOne.getLastnameAuthor();
        System.out.println("Автор книги: " + name + " " + lastname);
        System.out.println("Год издания: " + book.getPublisherYear());

        System.out.println();

        Author bookTwo = new Author("Лев", "Толстой");
        Book bookNew = new Book("Анна Каренина", bookTwo, 2013);
        bookNew.setPublishingYear(2023);
        name = bookTwo.getNameAuthor();
        lastname = bookTwo.getLastnameAuthor();
        System.out.println("Автор книги: " + name + " " + lastname);
        System.out.println("Автор книги: ");
        System.out.println("Год издания: " + bookNew.getPublisherYear());

    }
}