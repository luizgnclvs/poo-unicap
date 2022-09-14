package question3;

public class UpperVIPArea extends VIP {
    private double areaAdditional;

    public UpperVIPArea () {}

    public UpperVIPArea (double value, double additionalValue, double areaAdditional) {
        super(value, additionalValue);
        this.areaAdditional = areaAdditional;
    }

    public double getAreaAdditional () {
        return this.areaAdditional;
    }

    public void setAreaAdditional (double areaAdditional) {
        this.areaAdditional = areaAdditional;
    }

    @Override
    public void printValue () {
        System.out.printf("O valor do ingresso é R$ %f.2" + (super.getValue() + super.getAdditionalValue() + this.areaAdditional));
    }
}
