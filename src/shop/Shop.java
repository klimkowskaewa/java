package shop;

public class Shop {
    public static void main(String[] args) {

        ShopProduct product1 = new ShopProduct("Milk", 4.89);
        ShopProduct product2 = new ShopProduct("Milk", 4.89);

        System.out.println(product1==product2);
        System.out.println(product1.equals(product2));
    }

}
