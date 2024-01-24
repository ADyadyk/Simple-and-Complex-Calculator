package model.repository.impl;

import model.repository.Calculable;
import util.ComplexNumber;

public class ComplexNumberCalculatorRepository implements Calculable<ComplexNumber> {
    @Override
    public ComplexNumber multiply(ComplexNumber x, ComplexNumber y) {
        Double a = x.getDoublePart();
        Double b = x.getComplexPart();
        Double c = y.getDoublePart();
        Double d = y.getComplexPart();

        Double resultDoublePart = (a * c) - (b * d);
        Double resultComplexPart = (a * d + b * c);

        return new ComplexNumber(resultDoublePart, resultComplexPart);
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber x, ComplexNumber y) {
        Double a = x.getDoublePart();
        Double b = x.getComplexPart();
        Double c = y.getDoublePart();
        Double d = y.getComplexPart();

        Double resultDoublePart = a - c;
        Double resultComplexPart = b - d;
        return new ComplexNumber(resultDoublePart, resultComplexPart);
    }

    @Override
    public ComplexNumber sum(ComplexNumber x, ComplexNumber y) {
        Double a = x.getDoublePart();
        Double b = x.getComplexPart();
        Double c = y.getDoublePart();
        Double d = y.getComplexPart();

        Double resultDoublePart = a + c;
        Double resultComplexPart = b + d;
        return new ComplexNumber(resultDoublePart, resultComplexPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber x, ComplexNumber y) {
        Double a = x.getDoublePart();
        Double b = x.getComplexPart();
        Double c = y.getDoublePart();
        Double d = y.getComplexPart();

        Double resultDoublePart = ((a * c) + (b * d)) / ((c * c) + (d * d));
        Double resultComplexPart = ((c * b) - (a * d)) / ((c * c) + (d * d));
        return new ComplexNumber(resultDoublePart, resultComplexPart);
    }
}
