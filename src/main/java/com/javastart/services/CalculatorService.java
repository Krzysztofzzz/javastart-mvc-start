package com.javastart.services;

public class CalculatorService {
    public static double calculate(double a, double b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> throw new IllegalArgumentException("Nieobsługiwalny operator matematyczny");
        };
    }
}
