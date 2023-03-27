package accessmodifier.shape;

public class ShapeRectangle extends Shape{
    private int width;
    private int length;

    public ShapeRectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return length*width;
    }

}