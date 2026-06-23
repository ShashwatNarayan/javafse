package com.cognizant.dsa.forecasting;

public class ForecastingDemo {

    public static void main(String[] args) {
        double presentValue    = 10_000.0;
        double annualGrowthRate = 0.08;

        System.out.printf("Present Value    : $%.2f%n", presentValue);
        System.out.printf("Annual Growth    : %.0f%%%n", annualGrowthRate * 100);
        System.out.println();

        for (int years = 1; years <= 10; years++) {
            double futureValue = FinancialForecasting.calculateFutureValue(presentValue, annualGrowthRate, years);
            System.out.printf("Year %2d  ->  $%.2f%n", years, futureValue);
        }
    }
}
