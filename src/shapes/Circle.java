package shapes;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2.0 * Math.PI * radius;
    }

    public String toString() {
        String response = String.format("Circle data:\n\tRadius: %.3f\n\tCircumference: %.3f\n\tArea: %.3f\n", radius, getCircumference(), getArea());
        return response;
    }

    public String describeData() {
        StringBuilder sb = new StringBuilder("Circle data:\n");
        sb.append(String.format("\tRadius: %.3f\n", radius));
        sb.append(String.format("\tCircumference: %.3f\n", getCircumference()));
        sb.append(String.format("\tArea: %.3f\n", getArea()));
        return sb.toString();
    }
}
