package Dog;

public class TestDog {
    public static void main(String[] args) {
        Labrador labrador = new Labrador("Max", 3);
        Yorshire yorshire = new Yorshire("Bella", 5);

        System.out.println(labrador.getName() + " is a " + labrador.getClass().getSimpleName() + " and is " + labrador.getAge() + " years old.");
        System.out.println(yorshire.getName() + " is a " + yorshire.getClass().getSimpleName() + " and is " + yorshire.getAge() + " years old.");

        labrador.bark();
        yorshire.bark();
    }
}
