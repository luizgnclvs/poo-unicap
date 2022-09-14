package question2.b;

public class Poor extends Person {

    public Poor () {}

    public Poor (String name, int age) {
        super(name, age);
    }

    public void work () {
        System.out.println(super.getName() + " está trabalhando.");
    }
}
