package pckg2.components;

import pckg2.exceptions.BlankTextException;
import pckg2.exceptions.InvalidDataException;

public class NaturalPersonName extends Name {
    private String firstName;
    private String middleName;
    private String surname;

    public NaturalPersonName () {}

    public NaturalPersonName (String firstName, String middleName, String surname) throws InvalidDataException {
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setSurname(surname);
    }

    public String getFirstName () {
        return this.firstName;
    }

    public void setFirstName (String firstName) throws InvalidDataException {
        if (Services.isStringValid(firstName)) {
            this.firstName = firstName;
        } else {
            throw new BlankTextException();
        }
    }

    public String getMiddleName () {
        return this.middleName;
    }

    public void setMiddleName (String middleName) throws InvalidDataException {
        if (Services.isStringValid(middleName)) {
            this.middleName = middleName;
        } else {
            throw new BlankTextException();
        }
    }

    public String getSurname () {
        return this.surname;
    }

    public void setSurname (String surname) throws InvalidDataException {
        if (Services.isStringValid(surname)) {
            this.surname = surname;
        } else {
            throw new BlankTextException();
        }
    }

    public String toString () {
        return this.firstName + " " + this.middleName + " " + this.surname;
    }
}
