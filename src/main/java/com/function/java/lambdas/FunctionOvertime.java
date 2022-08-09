package com.function.java.lambdas;


@FunctionalInterface
/*
 to indicate that the class is used to implements lambda functions
*/
public interface FunctionOvertime {
    double valueAt(int time);

    static  FunctionOvertime monthByMonth(final double[] values){
        return time -> values[time-1];
    }

    static FunctionOvertime constantValue(final double value) {
        return polynomial(new double[]{value});
    }

    static FunctionOvertime line (final double intercept, final double slope){
        return polynomial(new double[] {intercept, slope});
    }

    static FunctionOvertime polynomial(final double[] coeff){
        return time -> {
            double sum = 0.0;
            for(int i = 0; i< coeff.length; ++i){
                sum+= Math.pow(time,i) *coeff[i];
            }
            return sum;
        };
    }

    @FunctionalInterface
    static interface FunctionOf3 {
        double apply(double a, double b, double c);
    }

    static FunctionOvertime combinationOf3 ( final FunctionOvertime a, final FunctionOvertime b, FunctionOvertime c,
                                             final FunctionOf3 f){
        return time -> f.apply(a.valueAt(time), b.valueAt(time), c.valueAt(time));
    }
}
