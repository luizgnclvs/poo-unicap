package exercise;

public class Dog {
    private String name;
    private String breed;

    public Dog () {}

    public Dog (String name, String breed) {
        this.setName(name);
        this.setBreed(breed);
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        if (name.equals(null) || name.trim().equals("")) {
            System.out.println("O nome não pode receber valores vazios.");
        } else {
            this.name = name;
        }
    }

    public String getBreed () {
        return this.breed;
    }

    public void setBreed (String breed) {
        if (breed.equals(null) || breed.trim().equals("")) {
            System.out.println("A raça não pode receber valores vazios.");
        } else {
            this.breed = breed;
        }
    }

    public void bark () {
        System.out.println(this.name + " diz \"au au!!\".");
    }

    public void sleep () {
        System.out.println(this.name + " está dormindo... Zzzz...");
    }

    public void eat () {
        System.out.println(this.name + " está comendo. Nam nam.");
    }
}
