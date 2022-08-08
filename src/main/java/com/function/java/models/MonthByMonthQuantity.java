package com.function.java.models;

public abstract class MonthByMonthQuantity implements QuantityOfInterest{

    private final double[] values;

    public MonthByMonthQuantity(double[] values) {
        this.values = values;
    }

    @Override
    public double valueAt(int time) {
        return values[time-1];
    }
}
