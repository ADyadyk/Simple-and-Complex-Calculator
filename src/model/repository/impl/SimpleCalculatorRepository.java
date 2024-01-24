package model.repository.impl;

import model.repository.Calculable;

public class CalculatorRepository implements Calculable<double> {
    @Override
    public double multiply(double x, double y) {
        return x * y;
    }

    @Override
    public double subtraction(double x, double y) {
        return x - y;
    }

    @Override
    public double sum(double x, double y) {
        return x + y;
    }

    @Override
    public double divide(double x, double y) {
        if(y == 0)
        return 0;
    }
}
