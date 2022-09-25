package question2;

public class Circle implements GeometricShape {
    private double radius;
    private static final double PI = 3.14;

    public Circle () {}

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius () {
        return this.radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double area () {
        return PI * this.radius * this.radius;
    }

    public double perimeter () {
        return 2 * PI * this.radius;
    }
}
