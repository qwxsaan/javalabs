package Furniture;

public class Chair extends Furniture{
    private int numberOfLegs;

    public Chair(String material, String color, int numberOfLegs) {
        super(material, color);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void use() {
        System.out.println("Sitting on a chair.");
    }
}
