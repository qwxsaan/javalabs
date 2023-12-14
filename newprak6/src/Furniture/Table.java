package Furniture;

public class Table extends Furniture{
    private int length;
    private int width;

    public Table(String material, String color, int length, int width) {
        super(material, color);
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void use() {
        System.out.println("Using a table to work or eat.");
    }
}
