package question2.a;

public class Dog extends Animal {

    public Dog () {}

    public Dog (String name) {
        super(name);
    }

    public void bark () {
        System.out.println(super.getName() + " diz: \"au au au!!\"");
    }
}
