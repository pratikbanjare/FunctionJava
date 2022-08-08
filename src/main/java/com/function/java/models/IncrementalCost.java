package com.function.java.models;

public class IncrementalCost extends PolynomialQuantity{

    public IncrementalCost( final double intercept, final double slope) {
        super(new double[]{intercept, slope});
    }

    @Override
    public String getName(){
        return "Incremental costs!!!";
    }
}
