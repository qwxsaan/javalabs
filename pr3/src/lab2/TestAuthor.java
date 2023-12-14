package lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Ivan Ivanovich", "ivanivanov@gmail.ru", 'M');
        System.out.println(a1.toString());
        a1.setEmail("ivanov@yandex.ru");
        System.out.println(a1.toString());
    }
}
