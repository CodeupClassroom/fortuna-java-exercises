package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.printf("Perimeter: %f\tArea: %f\n", box1.getPerimeter(), box1.getArea());
        Rectangle box2 = new Square(5);
        System.out.printf("Perimeter: %f\tArea: %f\n", box2.getPerimeter(), box2.getArea());
    }
}
