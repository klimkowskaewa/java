package shape;

public class ShapeTriangle extends Shape{
    private int base;
    private int hight;

    public ShapeTriangle(int base, int hight) {
        this.base = base;
        this.hight = hight;
    }

    @Override
    public double getArea() {
        return (hight*base)/2.;
    }

}