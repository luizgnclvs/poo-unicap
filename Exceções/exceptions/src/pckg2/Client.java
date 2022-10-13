package pckg2;

import pckg2.components.Address;
import pckg2.components.ClientInfo;
import pckg2.components.Date;
import pckg2.components.Phone;
import pckg2.components.Name;
import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NegativeOrNullNumberException;

public class Client {
    private Name name;
    private ClientInfo info;
    private Date dateOfBirth;
    private Phone phone;
    private Address address;
    private double salary;

    public Client () {}

    public Client (Name name, ClientInfo info, Date dateOfBirth, Phone phone, Address address, double salary) throws InvalidDataException {
        this.name = name;
        this.info = info;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.address = address;
        this.setSalary(salary);
    }

    public Name getName () {
        return this.name;
    }

    public void setName (Name name) {
        this.name = name;
    }

    public ClientInfo getInfo () {
        return this.info;
    }

    public void setInfo (ClientInfo info) {
        this.info = info;
    }

    public Date getDateOfBirth () {
        return this.dateOfBirth;
    }

    public void setDateOfBirth (Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Phone getPhone () {
        return this.phone;
    }

    public void setPhone (Phone phone) {
        this.phone = phone;
    }

    public Address getAddress () {
        return this.address;
    }

    public void setAddress (Address address) {
        this.address = address;
    }

    public double getSalary () {
        return this.salary;
    }

    public void setSalary (double salary) throws InvalidDataException {
        if (salary < 0) {
            throw new NegativeOrNullNumberException();
        }
        this.salary = salary;
    }
}
