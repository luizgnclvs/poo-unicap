package question3;

public class UpperVIPArea extends VIP {
    private String area;
    private double areaAdditional;

    public UpperVIPArea () {}

    public UpperVIPArea (double value, double additionalValue, String area, double areaAdditional) {
        super(value, additionalValue);
        this.area = area;
        this.areaAdditional = areaAdditional;
    }

    public String getArea () {
        return this.area;
    }

    public void setArea (String area) {
        this.area = area;
    }

    public double getAreaAdditional () {
        return this.areaAdditional;
    }

    public void setAreaAdditional (double areaAdditional) {
        this.areaAdditional = areaAdditional;
    }

    public void printArea () {
        System.out.println("Ingresso referente a área " + this.area);
    }

    @Override
    public void printValue () {
        System.out.printf("O valor do ingresso é R$ %,.2f", super.getValue() + super.getAdditionalValue() + this.areaAdditional);
    }
}
