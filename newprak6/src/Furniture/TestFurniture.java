package Furniture;

public class TestFurniture {
    public static void main(String[] args) {
        Chair chair = new Chair("wood", "brown", 4);
        Table table = new Table("glass", "transparent", 120, 80);

        FurnitureShop shop = new FurnitureShop();
        shop.addFurniture(chair);
        shop.addFurniture(table);

        shop.showFurniture();

        chair.use();
        table.use();
    }
}
