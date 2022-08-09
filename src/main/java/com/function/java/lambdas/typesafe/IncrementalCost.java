package com.function.java.lambdas.typesafe;

import com.function.java.lambdas.FunctionOvertime;
import com.function.java.models.QuantityOfInterest;

public class IncrementalCost implements QuantityOfInterest {

    private final FunctionOvertime valueFunction;

    public IncrementalCost(FunctionOvertime valueFunction) {
        this.valueFunction = valueFunction;
    }

    @Override
    public String getName() {
        return "Incremental cost!!!";
    }

    @Override
    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }
}
