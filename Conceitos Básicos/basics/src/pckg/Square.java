package pckg;

public class Square {
    double side;

    public Square () {
        this.side = 5;
    }

    public Square (double side) {
        this.side = side;
    }

    public double area () {
        return this.side * this.side;
    }

    public double perimeter () {
        return this.side * 4;
    }
    
    public void draw () {
        for (int i = 0; i < this.side; i++) {
            System.out.print("\n");

            for (int j = 0; j < this.side; j++) {
                System.out.print("\u25A2  ");
            }
        }
    }
}
