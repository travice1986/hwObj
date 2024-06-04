public class Main {
    public static void main(String[] args) {
        Author bookOne = new Author("Фёдор", "Достоевский");
        Book book = new Book("Идиот", bookOne, 2016);
        System.out.println(book);

        System.out.println();

        Author bookTwo = new Author("Фёдор", "Достоевский");
        Book bookNew = new Book("Идиот", bookTwo, 2015);

        System.out.println(bookNew);

        System.out.println();

        if (book.equals(bookNew)) {
            System.out.println("Книги дублируются");
        } else {
            System.out.println("Книги разные");
        }
        System.out.println(bookOne.hashCode() + " " + bookTwo.hashCode());
    }
}