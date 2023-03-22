import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    public Box(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Box(Point topLeft, Point bottomRight) {
        this(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
    }

    public Box(Point topLeft, int w, int h) {
        this(topLeft.x, topLeft.y, topLeft.x + w,topLeft.y + h );
    }

    void printBox(){
        System.out.println("Box: <" + x1 + ", " + y1 + ", " + x2 + ", " + y2 + ">");
    }

    public static void main(String[] args) {
        Box box;
        System.out.println("Coordinates (25,25) and (50,50)");
        box = new Box (25,25,50,50);
        box.printBox();
        System.out.println("Using two points (1,1) and (10,5)");
        box = new Box(new Point(1,1), new Point(10,5));
        box.printBox();
        System.out.println("Point (10,10), width 20, height 5");
        box = new Box(10,10,20,5);
        box.printBox();
    }
}
