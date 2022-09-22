package question1;

public class AdministrativeAssistant extends Assistant {
    private String shift; //Preferencialmente seria um enum.

    public AdministrativeAssistant () {}

    public AdministrativeAssistant (String name, double salary, int registry, String shift) {
        super(name, salary, registry);
        this.shift = shift;
    }

    public String getShift () {
        return this.shift;
    }

    public void setShift (String shift) {
        this.shift = shift;
    }

    @Override
    public double annualPay () {
        if (shift.equalsIgnoreCase("noturno")) {
            return super.annualPay() * 1.15; //15% de bônus
        } else {
            return super.annualPay();
        }
    }
}
