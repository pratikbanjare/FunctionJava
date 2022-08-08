package com.function.java.lambdas;


@FunctionalInterface
/*
 to indicate that the class is used to implements lambda functions
*/
public interface FunctionOvertime {
    double valueAt(int time);
}
