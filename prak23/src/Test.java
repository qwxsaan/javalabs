
public class Test {
    public static void main(String[] args) {
        TablesOrderManager orderManager = new TablesOrderManager(10);
        Order[] orders = new Order[10];
        for (int i = 0; i < orders.length; i++)
            orders[i] = new Order();
        orders[3].add(new Dish(199,"Pasta", "Carbonara"));
        orders[3].add(new Dish(40,"Tea", "BlackTea"));
        orders[1].add(new Dish(275, "Lunch", "Combo"));
        orderManager.add(orders[3], 7);
        orderManager.add(orders[5], 5);
        orderManager.removeOrder(5);
        orderManager.add(orders[1],3);
        System.out.println(orderManager.ordersCostSummary());
        System.out.println(orderManager.freeTableNumbers());
        System.out.println(orderManager.freeTableNumber());
    }
}
