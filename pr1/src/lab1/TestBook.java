package lab1;
import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Pushkin", 1815);
        Book d2 = new Book("Tolstoy", 1800);
        Book d3 = new Book("Kuprin");
        System.out.println(d1);
        System.out.println(d2);
        d3.setYear(1765);
        System.out.println(d3);
    }
}
