package pckg2.components;

import pckg2.exceptions.BlankTextException;
import pckg2.exceptions.InvalidDataException;

public class Name {
    private String firstName;
    private String middleName;
    private String surname;

    public Name () {}

    public Name (String firstName, String middleName, String surname) throws InvalidDataException {
        this.setFirstName(firstName);
        this.setMiddleName(middleName);
        this.setSurname(surname);
    }

    public String getFirstName () {
        return this.firstName;
    }

    public void setFirstName (String firstName) throws InvalidDataException {
        if (firstName.equals(null) || firstName.trim().equals("")) {
            throw new BlankTextException();
        } else {
            this.firstName = firstName;
        }
    }

    public String getMiddleName () {
        return this.middleName;
    }

    public void setMiddleName (String middleName) throws InvalidDataException {
        if (middleName.equals(null) || middleName.trim().equals("")) {
            throw new BlankTextException();
        } else {
            this.middleName = middleName;
        }
    }

    public String getSurname () {
        return this.surname;
    }

    public void setSurname (String surname) throws InvalidDataException {
        if (surname.equals(null) || surname.trim().equals("")) {
            throw new BlankTextException();
        } else {
            this.surname = surname;
        }
    }
}
