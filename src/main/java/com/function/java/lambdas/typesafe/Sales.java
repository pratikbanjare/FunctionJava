package com.function.java.lambdas.typesafe;

import com.function.java.lambdas.FunctionOvertime;
import com.function.java.models.QuantityOfInterest;

public class Sales implements QuantityOfInterest {

    private final FunctionOvertime valueFunction;

    public Sales(FunctionOvertime valueFunction) {
        this.valueFunction = valueFunction;
    }

    @Override
    public String getName() {
        return "sales!!!";
    }

    @Override
    public double valueAt(int time) {
        return valueFunction.valueAt(time);
    }
}
