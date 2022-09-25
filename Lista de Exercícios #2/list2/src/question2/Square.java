package question2;

public class Square implements GeometricShape {
    private double side;

    public Square () {}

    public Square (double side) {
        this.side = side;
    }

    public double getSide () {
        return this.side;
    }

    public void setSide (double side) {
        this.side = side;
    }

    public double area () {
        return this.side * this.side;
    }

    public double perimeter () {
        return this.side * 4;
    }
}
