package chapter10.use;

import chapter10.make.Order;

public class TaxCalculator {

    private boolean useRegional;
    private boolean useGeneral;
    private boolean useSurCharge;

    public static double calculate(Order order, boolean useRegional,
                                   boolean useGeneral, boolean useSurChange) {
        double value = order.getValue();
        if (useRegional) value = Tax.regional(value);
        if (useGeneral) value = Tax.general(value);
        if (useSurChange) value = Tax.surcharge(value);
        return value;
    }

    public TaxCalculator withTaxRegional() {
        useRegional = true;
        return this;
    }

    public TaxCalculator withTaxGeneral() {
        useGeneral = true;
        return this;
    }

    public TaxCalculator withTaxSurCharge() {
        useSurCharge = true;
        return this;
    }

    public double calculate(Order order) {
        return calculate(order, useRegional, useGeneral, useSurCharge);
    }
}
