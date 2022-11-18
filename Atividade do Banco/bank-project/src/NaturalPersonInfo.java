import exceptions.InvalidDataException;
import exceptions.NegativeOrNullNumberException;

public class NaturalPersonInfo extends ClientInfo {
    private long CPF;
    private int RG;

    public NaturalPersonInfo () {}

    public NaturalPersonInfo (long CPF, int RG) throws InvalidDataException {
        this.setCPF(CPF);
        this.setRG(RG);
    }

    public long getCPF() {
        return this.CPF;
    }

    public void setCPF (long CPF) throws InvalidDataException {
        if (CPF <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (Services.isNumberLengthValid(CPF, 11)) {
                this.CPF = CPF;
            } else {
                throw new InvalidDataException("O valor '" + CPF + "' não é um CPF válido");
            }
        }
    }

    public int getRG () {
        return this.RG;
    }

    public void setRG (int RG) throws InvalidDataException {
        if (RG <= 0) {
            throw new NegativeOrNullNumberException();
        } else {
            if (Services.isNumberLengthValid(RG, 7)) {
                this.RG = RG;
            } else {
                throw new InvalidDataException("O valor '" + RG + "' não é um RG válido");
            }
        }
    }
}