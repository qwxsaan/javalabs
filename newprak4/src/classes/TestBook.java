package classes;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Leo Tolstoy", "War and Peace", 1869);
        System.out.println("Book \"" + book.getTitle() + "\" written by " + book.getAuthor() + " in " + book.getYear());
        book.setYear(1871);
        System.out.println("Book's year changed to " + book.getYear());
    }
}
