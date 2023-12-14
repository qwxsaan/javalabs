package dishh;

public class TestDish {
    public static void main(String[] args) {
        Plate plate = new Plate("ceramic", "white", 20);
        Cup cup = new Cup("glass", "transparent", 250);

        System.out.println("Plate is made of " + plate.getMaterial() + " and has a diameter of " + plate.getDiameter() + " cm.");
        System.out.println("Cup is made of " + cup.getMaterial() + " and has a volume of " + cup.getVolume() + " ml.");

        plate.use();
        cup.use();
    }
}
