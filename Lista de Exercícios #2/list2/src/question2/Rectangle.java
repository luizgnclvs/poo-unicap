package question2;

public class Rectangle implements GeometricShape {
    private double length, heigth;

    public Rectangle () {}

    public Rectangle (double length, double height) {
        this.length = length;
        this.heigth = height;
    }

    public double getLength () {
        return this.length;
    }

    public void setLenght (double length) {
        this.length = length;
    }

    public double getHeigth () {
        return this.heigth;
    }

    public void setHeigth (double height) {
        this.heigth = height;
    }

    public double area () {
        return this.length * this.heigth;
    }

    public double perimeter () {
        return this.length * 2 + this.heigth * 2;
    }
}
