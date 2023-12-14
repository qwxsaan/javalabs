package Dog;

public class Yorshire extends Dog {
    public Yorshire(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Yorshire is barking.");
    }
}
