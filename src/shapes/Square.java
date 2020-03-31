package shapes;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
        System.out.println("In Square Area");
        return length * length;
    }

    @Override
    public double getPerimeter() {
        System.out.println("In Square Perimeter");
        return length * 4;
    }
}
