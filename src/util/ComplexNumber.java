package util;

public class ComplexNumber {
    private final Double doublePart;
    private final Double complexPart;

    public ComplexNumber(Double doublePart, Double complexPart) {
        this.doublePart = doublePart;
        this.complexPart = complexPart;
    }

    public double getDoublePart() {
        return doublePart;
    }

    public double getComplexPart() {
        return complexPart;
    }

    @Override
    public String toString(){
        String operator = "+";
        if(complexPart < 0) return String.format(doublePart + "-" + (complexPart)*(-1) + "i");
        if(complexPart == 0) return String.format("%s", doublePart);
        else return String.format(doublePart + "+" + complexPart + "i");
    }
}
