package com.function.java;

import com.function.java.lambdas.FunctionOvertime;
import com.function.java.models.FixedCost;
import com.function.java.models.IncrementalCost;
import com.function.java.models.Profit;
import com.function.java.models.Sales;

public class App {

    public static double[]  EXPECTED_SALES_FROM_JAN_TO_DEC = new double[] {144,155,123,131,156,199,144,200,211,155,176,185};

    public static void main(String[] args) {

        final FunctionOvertime sales = (time) -> EXPECTED_SALES_FROM_JAN_TO_DEC[time-1];

        final FunctionOvertime fixedCost = time -> 15.0;

        final FunctionOvertime incrementalCost = time -> 5.0 + 1.5 * time;

        final FunctionOvertime profit =
                (time) -> sales.valueAt(time) - (fixedCost.valueAt(time) + incrementalCost.valueAt(time));

        double total = 0.0;
        for (int i = 1; i<=EXPECTED_SALES_FROM_JAN_TO_DEC.length; ++i){
            total+= profit.valueAt(i);
        }

        System.out.println("Total profit for this year : "+ total);
    }
}
