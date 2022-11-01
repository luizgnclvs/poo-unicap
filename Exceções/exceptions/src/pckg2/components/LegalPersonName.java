package pckg2.components;

import pckg2.exceptions.BlankTextException;
import pckg2.exceptions.InvalidDataException;

public class LegalPersonName extends Name {
    private String companyName;
    private String tradeName;

    public LegalPersonName () {}

    public LegalPersonName (String companyName, String tradeName) throws InvalidDataException {
        this.setCompanyName(companyName);
        this.setTradeName(tradeName);
    }

    public String getCompanyName () {
        return this.companyName;
    }

    public void setCompanyName (String companyName) throws InvalidDataException {
        if (Services.isStringValid(companyName)) {
            this.companyName = companyName;
        } else {
            throw new BlankTextException();
        }
    }

    public String getTradeName () {
        return this.tradeName;
    }

    public void setTradeName (String tradeName) throws InvalidDataException {
        if (Services.isStringValid(tradeName)) {
            this.tradeName = tradeName;
        } else {
            throw new BlankTextException();
        }
    }

    public String toString () {
        return "Razão Social: " + this.companyName + " // Nome Fantasia: " + this.tradeName;
    }
}
