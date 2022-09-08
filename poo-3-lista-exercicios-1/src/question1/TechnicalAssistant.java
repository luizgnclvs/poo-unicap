package question1;

public class TechnicalAssistant extends Assistant {
    private double bonus;

    public TechnicalAssistant () {}

    public TechnicalAssistant (String name, double salary, int registry, double bonus) {
        super(name, salary, registry);
        this.bonus = bonus;
    }

    public double getBonus () {
        return this.bonus;
    }

    public void setBonus (double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double annualPay () {
        return (super.getSalary() + bonus) * 12;
    }
}
