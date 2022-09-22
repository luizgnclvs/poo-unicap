package question3;

public class LowerVIPArea extends VIP {
    private String area;

    public LowerVIPArea () {}

    public LowerVIPArea (double value, double additionalValue, String area) {
        super(value, additionalValue);
        this.area = area;
    }

    public String getArea () {
        return this.area;
    }

    public void setArea (String area) {
        this.area = area;
    }

    public void printArea () {
        System.out.println("Ingresso referente a área " + this.area);
    }
}
