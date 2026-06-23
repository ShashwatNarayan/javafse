package com.cognizant.dsa.forecasting;

public class FinancialForecasting {

    public static double calculateFutureValue(double presentValue, double annualGrowthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return calculateFutureValue(presentValue * (1 + annualGrowthRate), annualGrowthRate, years - 1);
    }
}
