package pckg;

public class Client {
    private String name;
    private int rg;
    private long cpf;
    private Phone phone;
    private Date birthday;
    private Address address;

    public Client () {}

    public Client (String name, int rg, long cpf, Phone phone, Date birthday, Address address) {
        this.name = name;
        this.rg = rg;
        this.cpf = cpf;
        this.phone = phone;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getRG () {
        return this.rg;
    }

    public void setRG (int rg) {
        this.rg = rg;
    }

    public long getCPF () {
        return this.cpf;
    }

    public void setCPF (long cpf) {
        this.cpf = cpf;
    }

    public Phone getPhone () {
        return this.phone;
    }

    public void setPhone (Phone phone) {
        this.phone = phone;
    }

    public Date getBirthday () {
        return this.birthday;
    }

    public void setBirthday (Date birthday) {
        this.birthday = birthday;
    }

    public Address getAddress () {
        return this.address;
    }

    public void setAddress (Address address) {
        this.address = address;
    }
}
