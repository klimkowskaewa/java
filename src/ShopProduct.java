import java.util.Objects;

public class ShopProduct {
    public String name;
    private double price;

    public ShopProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopProduct product = (ShopProduct) o;
        return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
    }

}
