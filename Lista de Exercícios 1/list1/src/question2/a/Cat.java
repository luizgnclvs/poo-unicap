package question2.a;

public class Cat extends Animal {

    public Cat () {}

    public Cat (String name) {
        super(name);
    }

    public void meow () {
        System.out.println(super.getName() + " diz: \"miaaaau\"");
    }
}
