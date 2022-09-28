package exercise;

public class Application {

    public static void print (Dog dog) {
        System.out.println("Nome: " + dog.getName());
        System.out.println("Raça: " + dog.getBreed());

        System.out.println();

        dog.bark();
        dog.sleep();
        dog.eat();

        if (dog instanceof TrainedDog) {
            ((TrainedDog)dog).lieDown();
            ((TrainedDog)dog).roll();
            ((TrainedDog)dog).playDead();
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Doge", "Shiba Inu");
        Dog trainedDog = new TrainedDog("Milo", "Black Mouth Cur");

        System.out.println();
        print(dog);

        System.out.println();
        print(trainedDog);
    }
}
