import java.util.ArrayList;

import exceptions.BlankTextException;

public class Client {
    private String name;
    private ClientInfo personalInfo;
    private Address address;
    private ArrayList<ContactInfo> contactInfo;

    public Client () {}

    public Client (String name, ClientInfo personalInfo, Address address, ArrayList<ContactInfo> contactInfo) {
        this.name = name;
        this.personalInfo = personalInfo;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) throws BlankTextException {
        if (Services.isStringValid(name)) {
            this.name = name;
        } else {
            throw new BlankTextException();
        }
    }

    public ClientInfo getPersonalInfo () {
        return this.personalInfo;
    }

    public void setPersonalInfo (ClientInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Address getAddress () {
        return this.address;
    }

    public void setAddress (Address address) {
        this.address = address;
    }

    public ArrayList<ContactInfo> getContactInfo () {
        return this.contactInfo;
    }

    public void setContactInfo (ArrayList<ContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void addContact (ContactInfo contact) {
        this.contactInfo.add(contact);
    }

    public void removeContact (int index) {
        this.contactInfo.remove(index);
    }

    public void removeContact (ContactInfo contact) {
        this.contactInfo.remove(contact);
    }
}
