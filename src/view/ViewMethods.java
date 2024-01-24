package view;

import util.Operators;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShowMenu {
    private final List<String> validOperators;

    public ShowMenu() {
        this.validOperators = Arrays.stream(Operators.values())
                .map(Operators::operator)
                .collect(Collectors.toList());
    }


    public void showOperators(){
        System.out.println("Выберите оператор действия из предложенных: *, +, -, /");
    }




    public String selectOperator(String operatorSymbol){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the math operation (*, +, /, -) : ");
        String operator = in.nextLine();
        while (true) {
            if (isInvalidOperator(operator)) {
                System.err.println("Entered invalid math operator. " + "Enter the math operation (*, +, /, -) : ");
                operator = in.nextLine();
            } else return operator;
        }
    }

    private boolean isInvalidOperator(String operator) {
        return !validOperators.contains(operator);
    }
}
