package pckg2;

public class RightTriangle {
    double base, height, hypotenuse;

    public RightTriangle () {
        this.base = 7.5;
        this.height = 10;
        this.hypotenuse = 12.5;
    }

    public RightTriangle (double base, double height) {
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt(this.base * this.base + this.height * this.height);
    }

    public double area () {
        return (this.base * this.height) / 2;
    }

    public double perimeter () {
        return this.base + this.height + this.hypotenuse;
    }
}
