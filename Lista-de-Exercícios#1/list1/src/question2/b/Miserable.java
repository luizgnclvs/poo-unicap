package question2.b;

public class Miserable extends Person {

    public Miserable () {}

    public Miserable (String name, int age) {
        super(name, age);
    }

    public void beg () {
        System.out.println(super.getName() + " está mendigando.");
    }
}
