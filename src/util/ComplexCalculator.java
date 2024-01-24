package util;

public class ComplexCalculator {
    private final ComplexNumber complexNumber1;
    private final String operator;

    private final ComplexNumber complexNumber2;

    public ComplexCalculator(ComplexNumber complexNumber1, String operator, ComplexNumber complexNumber2) {
        this.complexNumber1 = complexNumber1;
        this.operator = operator;
        this.complexNumber2 = complexNumber2;
    }

    public ComplexNumber getComplexNumber1() {
        return complexNumber1;
    }

    public String getOperator() {
        return operator;
    }

    public ComplexNumber getComplexNumber2() {
        return complexNumber2;
    }
}
