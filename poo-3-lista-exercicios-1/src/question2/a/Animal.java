package question2.a;

public class Animal {
    private String name, breed;

    public Animal () {}

    public Animal (String name) {
        this.name = name;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getBreed () {
        return this.breed;
    }

    public void setBreed (String breed) {
        this.breed = breed;
    }

    public void walks () {
        System.out.println(this.name + " está caminhando...");
    }
}
