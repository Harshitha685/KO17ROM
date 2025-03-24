class BlinkItRunner {
    public static void main(String[] it) {
        String snacks = null;

        double ref = BlinkIt.deliveryOrders("Creme Strawberry Flavoured Wafers");
        System.out.println("The price of the entered snacks is: " + ref);

        double price = BlinkIt.deliveryOrders("Creme Strawberry Flavoured Wafers", 5);
        System.out.println("The price of the quantity is: " + price);
    }
}
