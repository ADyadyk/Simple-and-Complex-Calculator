package view;

import controller.CalculatorController;
import util.SimpleCalculator;
import util.ComplexCalculator;
import util.ComplexNumber;
import util.Operators;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ViewMethods<T> implements Showable<T>, Promptable, Preparable{
    private final List<String> validOperators;
    private final CalculatorController calculatorController = new CalculatorController();

    public ViewMethods() {
        this.validOperators = Arrays.stream(Operators.values())
                .map(Operators::operator)
                .collect(Collectors.toList());
    }

    @Override
    public int selectCalculator(){
        System.out.println();
        System.out.println("Сделайте выбор калькулятора:");
        System.out.println("1 - простой калькулятор");
        System.out.println("2 - калькулятор для комплексных чисел");
        System.out.println();
        return promptInt("Выберите номер калькулятора: ");
    }

    @Override
    public ComplexCalculator complexPrepare(){
        System.out.println();
        // Запрос первого числа:
        ComplexNumber complexNumber1 = getComplexNumber("Введите первое комплексное число:");
        System.out.println("Вы ввели комплексное число: " + complexNumber1);

        // Выводим меню оператора и выбор оператора:
        System.out.println();
        showOperators();
        String operator = selectOperator();
        System.out.println();

        // Запрос второго числа:
        ComplexNumber complexNumber2 = getComplexNumber("Введите второе комплексное число:");
        System.out.println("Вы ввели комплексное число: " + complexNumber2);
        return new ComplexCalculator(complexNumber1, operator, complexNumber2);
    }

    @Override
    public SimpleCalculator prepare(){
        System.out.println();
        // Запрос первого числа:
        Double number1 = promptDouble("Введите первое число:");

        // Выводим меню оператора и выбор оператора:
        showOperators();
        String operator = selectOperator();

        // Запрос второго числа:
        Double number2 = promptDouble("Введите второе число:");
        return new SimpleCalculator(number1, operator, number2);
    }

    @Override
    public void selectAction(String operator, T x, T y){
        System.out.println();
        // Логика выбора действия:
        if (operator.equals("*")) {
            System.out.print("Результат умножения: ");
            calculatorController.multiplyController(x, y);
        }
        if (operator.equals("-")) {
            System.out.print("Результат вычитания: ");
            calculatorController.subtractionController(x, y);
        }
        if (operator.equals("/")) {
            System.out.print("Результат деления: ");
            calculatorController.divideController(x, y);
        }
        if (operator.equals("+")) {
            System.out.print("Результат сложения: ");
            calculatorController.sumController(x, y);
        }
    }

    @Override
    public boolean exitRequest(){
        // Запрос на завершение работы калькулятора:
        String temp = promptString("Завершить работу калькулятора? (y/n) ");
        return !temp.equals("y");
    }

    @Override
    public String promptString(String message){
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public Integer promptInt(String message){
        return Integer.parseInt(promptString(message));
    }

    @Override
    public Double promptDouble(String message){
        return Double.parseDouble(promptString(message));
    }

    @Override
    public ComplexNumber getComplexNumber(String message){
        System.out.println(message);
        Double doublePart = promptDouble("Введите вещественую часть комплексного числа: ");
        Double complexPart = promptDouble("Введите комплексную часть числа (без i): ");
        return new ComplexNumber(doublePart,complexPart);
    }

    @Override
    public void showOperators(){
        System.out.println("Выберите оператор действия из предложенных: *, +, -, /");
    }

    @Override
    public String selectOperator(){
        Scanner in = new Scanner(System.in);
        String operator = in.nextLine();
        while (true) {
            if (isInvalidOperator(operator)) {
                System.err.println("Оператор не определён. " + "Выберите подходящий оператор (*, +, /, -) : ");
                operator = in.nextLine();
            } else return operator;
        }
    }
    /**
     * Проверка выбранного оператора
     */
    private boolean isInvalidOperator(String operator) {
        return !validOperators.contains(operator);
    }
}
