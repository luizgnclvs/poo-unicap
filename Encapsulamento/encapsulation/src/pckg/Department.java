package pckg;

public class Department {
    private int code;
    private String name;

    public Department () {}

    public Department (int code, String name) {
        this.setCode(code);
        this.setName(name);
    }

    public int getCode () {
        return this.code;
    }

    public void setCode (int code) {
        if (code >= 0) {
            this.code = code;
        } else {
            System.out.println("O código precisa ser um número maior que zero");
        }
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        name = name.trim();

        if (!name.equals(null) && !name.equals("")) {
            this.name = name;
        } else {
            System.out.println("O nome inserido não pode estar vazio.");
        }
    }

    public String toString () {
        return "Código: " + this.code + "\nNome: " + this.name;
    }
}
