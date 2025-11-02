// File: com/bank/util/InterestCalculator.java
package com.bank.util;

import static java.lang.Math.*;

public class InterestCalculator {
    public double calculateSimpleInterest(double P, double R, double T) {
        return (P * R * T) / 100;
    }

    public double calculateCompoundInterest(double P, double R, double T) {
        return P * (pow((1 + R / 100), T)) - P;
    }
}
// File: MainApp.java
import com.bank.util.InterestCalculator;

public class MainApp {
    public static void main(String[] args) {
        InterestCalculator calc = new InterestCalculator();
        System.out.println("Simple Interest: " + calc.calculateSimpleInterest(10000, 5, 2));
        System.out.println("Compound Interest: " + calc.calculateCompoundInterest(10000, 5, 2));
    }
}
