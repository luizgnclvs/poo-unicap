package question1;

public class TechnicalAssistant extends Assistant {

    public TechnicalAssistant () {}

    public TechnicalAssistant (String name, double salary, int registry) {
        super(name, salary, registry);
    }

    @Override
    public double annualPay () {
        return (super.getSalary() * 1.3) * 12; // 30% de bônus
    }
}
