package model.repository.impl;

import model.repository.Calculable;

public class SimpleCalculatorRepository implements Calculable<Double> {
    @Override
    public Double multiply(Double x, Double y) {
        return x * y;
    }

    @Override
    public Double subtraction(Double x, Double y) {
        return x - y;
    }

    @Override
    public Double sum(Double x, Double y) {
        return x + y;
    }

    @Override
    public Double divide(Double x, Double y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль недопустимо! Автоматически обнуляем результат.");
            return 0d;
        }
    }
}
