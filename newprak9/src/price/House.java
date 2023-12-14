package price;

public class House implements Priceable{
    private double area;
    private double price;

    public House(double area, double price) {
        this.area = area;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
    public double getArea(){
        return area;
    }
}
