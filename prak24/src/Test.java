public class Test {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager(10);
        Order[] orders = new Order[10];
        for (int i = 0; i < orders.length; i++)
            orders[i] = new RestarauntOrder();
        orders[3].add(new Dish(199,"Pasta", "Carbonara"));
        orders[4].add(new Drink(40,"Tea", "Black Tea"));
        orders[2].add(new Drink(275,"Lunch", "Combo"));
        orderManager.add(orders[3], 7);
        orderManager.add(orders[4], 6);
        orderManager.add(orders[3],2);
        orderManager.add("1", orders[3]);
        System.out.println(orderManager.getOrder("1").getItems());
        System.out.println(orderManager.freeTableNumbers());
    }
}
