package datatypes;

public class Rectangle {
    int length;
    int width;

    public Rectangle() {
    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(int lengthAndWidth) {
        this.length = lengthAndWidth;
        this.width = lengthAndWidth;
    }
    public double getArea() {
        return length*width;
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(10,5);
        Rectangle rectangle3 = new Rectangle(55);

        System.out.println("Surface area #1: " + rectangle1.getArea());
        System.out.println("Surface area #2: " + rectangle2.getArea());
        System.out.println("Surface area #3: " + rectangle3.getArea());

    }

}
