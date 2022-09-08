package pckg;

public class Card {
    private long number;
    private String cardholder;
    private int expirationMonth, expirationYear, cvv;

    public Card () {}

    public Card (long number, String cardholder, int expirationMonth, int expirationYear, int cvv) {
        this.number = number;
        this.cardholder = cardholder;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.cvv = cvv;
    }

    public long getNumber () {
        return this.number;
    }

    public void setNumber (long number) {
        this.number = number;
    }

    public String getCardholder () {
        return this.cardholder;
    }

    public void setCardholder (String cardholder) {
        this.cardholder = cardholder;
    }

    public int getExpirationMonth () {
        return this.expirationMonth;
    }

    public void setExpirationMonth (int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public int getExpirationYear () {
        return this.expirationYear;
    }

    public void setExpirationYear (int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public int getCVV () {
        return this.cvv;
    }

    public void setCVV (int cvv) {
        this.cvv = cvv;
    }
}
