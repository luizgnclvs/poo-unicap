package pckg2.components;

import pckg2.exceptions.InvalidDataException;
import pckg2.exceptions.NegativeOrNullNumberException;

public class LegalPersonInfo extends ClientInfo {
    private long CNPJ;

    public LegalPersonInfo () {}

    public LegalPersonInfo (long CNPJ) throws InvalidDataException {
        this.setCNPJ(CNPJ);
    }

    public long getCNPJ () {
        return this.CNPJ;
    }

    public void setCNPJ (long CNPJ) throws InvalidDataException {
        if (CNPJ <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (Services.isNumberLengthValid(CNPJ, 14)) {
                this.CNPJ = CNPJ;
            } else {
                throw new InvalidDataException("O valor inserido não é um CNPJ válido");
            }
        }
    }

    public String toString () {
        return "CNPJ: " + this.CNPJ;
    }
}
