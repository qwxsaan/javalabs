package Furniture;
import java.util.List;
import java.util.ArrayList;
public class FurnitureShop {
    private List<Furniture> furnitureList;

    public FurnitureShop() {
        this.furnitureList = new ArrayList<>();
    }

    public void addFurniture(Furniture furniture) {
        furnitureList.add(furniture);
    }

    public void showFurniture() {
        for (Furniture furniture : furnitureList) {
            System.out.println("Furniture: " + furniture.getClass().getSimpleName() + ", made of " + furniture.getMaterial() + ", color " + furniture.getColor());
        }
    }
}

