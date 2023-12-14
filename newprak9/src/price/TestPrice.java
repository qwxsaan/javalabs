package price;

import name.Animal;
import name.Planet;

public class TestPrice {
    public static void main(String[] args){
        Car car = new Car("BMW", 5000000);
        System.out.println(car.getBrand()+" costs "+ car.getPrice());
        House flat = new House(85.4,12000000);
        System.out.println("The flat with "+flat.getArea()+" square metres costs "+flat.getPrice());
    }
}
