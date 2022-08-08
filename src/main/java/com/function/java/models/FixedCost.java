package com.function.java.models;

public class FixedCost extends PolynomialQuantity{
    public FixedCost(double constants) {
        super(new double[] {constants});
    }

    @Override
    public String getName() {
        return "Fixed cost!!!";
    }
}
