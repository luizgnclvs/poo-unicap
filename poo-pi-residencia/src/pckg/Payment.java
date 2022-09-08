package pckg;

public class Payment {
    private double value;
    private int installments;
    private Date datetime;
    private Card card;

    public Payment () {}

    public Payment (double value, int installments, Date datetime, Card card) {
        this.value = value;
        this.installments = installments;
        this.datetime = datetime;
        this.card = card;
    }

    public double getValue () {
        return this.value;
    }

    public void setValue (double value) {
        this.value = value;
    }

    public int getInstallments () {
        return this.installments;
    }

    public void setInstallments (int installments) {
        this.installments = installments;
    }

    public Date getDatetime () {
        return this.datetime;
    }

    public void setDatetime (Date datetime) {
        this.datetime = datetime;
    }

    public Card getCard () {
        return this.card;
    }

    public void setCard (Card card) {
        this.card = card;
    }
}
