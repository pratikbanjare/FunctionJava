package com.function.java;

import com.function.java.lambdas.FunctionOvertime;
import com.function.java.lambdas.typesafe.FixedCost;
import com.function.java.lambdas.typesafe.IncrementalCost;
import com.function.java.lambdas.typesafe.Profit;
import com.function.java.lambdas.typesafe.Sales;


public class App {

    public static double[]  EXPECTED_SALES_FROM_JAN_TO_DEC = new double[] {144,155,123,131,156,199,144,200,211,155,176,185};

    public static void main(String[] args) {

        final Sales sales = new Sales(FunctionOvertime.monthByMonth(EXPECTED_SALES_FROM_JAN_TO_DEC));

        final FixedCost fixedCost = new FixedCost( FunctionOvertime.constantValue( 15.0));

        final IncrementalCost incrementalCost = new IncrementalCost(FunctionOvertime.line( 5.0,1.5));

        final Profit profit =
                new Profit(sales, incrementalCost, fixedCost);

        double total = 0.0;
        for (int i = 1; i<=EXPECTED_SALES_FROM_JAN_TO_DEC.length; ++i){
            total+= profit.valueAt(i);
        }

        System.out.println("Total profit for this year : "+ total);
    }
}
