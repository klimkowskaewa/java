package accessmodifier.shape;

public class ShapeGeometricFigures {
    public static void main(String[] args) {
        ShapeRectangle shapeRectangle = new ShapeRectangle(2,5);
        ShapeTriangle shapeTriangle = new ShapeTriangle(4,2);

        showArrea(shapeRectangle);
        showArrea(shapeTriangle);

        Shape[] shapes = {shapeRectangle, shapeTriangle};
    }

    public static void showArrea(Shape shape){
        System.out.println("Surface area: " + shape.getArea());
    }

}