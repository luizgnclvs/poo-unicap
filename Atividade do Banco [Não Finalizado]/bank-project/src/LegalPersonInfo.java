import exceptions.InvalidDataException;
import exceptions.NegativeOrNullNumberException;

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
                throw new InvalidDataException("O valor '" + CNPJ + "' não é um CNPJ válido");
            }
        }
    }
}
