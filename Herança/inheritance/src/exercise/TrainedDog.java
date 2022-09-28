package exercise;

public class TrainedDog extends Dog {

    public TrainedDog () {}

    public TrainedDog (String name, String breed) {
        super(name, breed);
    }

    public void lieDown () {
        System.out.println(super.getName() + " deita.");
    }

    public void roll () {
        System.out.println(super.getName() + " does a barrel roll... Err, " + super.getName() + " rola, quero dizer...");
    }

    public void playDead () {
        System.out.println(super.getName() + " se finge de morto.");
    }
}
