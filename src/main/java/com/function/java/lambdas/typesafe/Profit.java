package com.function.java.lambdas.typesafe;

import com.function.java.models.QuantityOfInterest;

public class Profit implements QuantityOfInterest {

    private final Sales sales;
    private final IncrementalCost incrementalCost;
    private final FixedCost fixedCost;

    public Profit(Sales sales, IncrementalCost incrementalCost, FixedCost fixedCost) {
        this.sales = sales;
        this.incrementalCost = incrementalCost;
        this.fixedCost = fixedCost;
    }

    @Override
    public String getName() {
        return "Profit!!!";
    }

    @Override
    public double valueAt(int time) {
        return sales.valueAt(time) - incrementalCost.valueAt(time) - fixedCost.valueAt(time);
    }
}
