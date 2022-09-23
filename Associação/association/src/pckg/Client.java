package pckg;

public class Client {
    private String name;
    private int RG;
    private long CPF;
    private Phone phone;
    private Date dateOfBirth;
    private Address address;

    public Client () {}

    public Client (String name, int RG, long CPF, Phone phone, Date dateOfBirth, Address address) {
        this.name = name;
        this.RG = RG;
        this.CPF = CPF;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getRG () {
        return this.RG;
    }

    public void setRG (int RG) {
        this.RG = RG;
    }

    public long getCPF () {
        return this.CPF;
    }

    public void setCPF (long CPF) {
        this.CPF = CPF;
    }

    public Phone getPhone () {
        return this.phone;
    }

    public void setPhone (Phone phone) {
        this.phone = phone;
    }

    public Date getDateOfBirth () {
        return this.dateOfBirth;
    }

    public void setDateOfBirth (Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress () {
        return this.address;
    }

    public void setAddress (Address address) {
        this.address = address;
    }
}
