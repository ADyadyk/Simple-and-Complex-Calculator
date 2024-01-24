package util;

public class Calculator {
    private final Double number1;
    private final String operator;
    private final Double number2;

    public Calculator(Double number1, String operator, Double number2) {
        this.number1 = number1;
        this.operator = operator;
        this.number2 = number2;
    }

    public Double getNumber1() {
        return number1;
    }

    public String getOperator() {
        return operator;
    }

    public Double getNumber2() {
        return number2;
    }
}
