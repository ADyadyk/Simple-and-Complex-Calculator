package view;

import util.SimpleCalculator;
import util.ComplexCalculator;

public class View {
    private final ViewMethods viewMethods = new ViewMethods();
    public void run(){
        boolean flag = true;
        while (flag){
            int numberOfCalculator = viewMethods.selectCalculator();
            if(numberOfCalculator == 1) {
                SimpleCalculator calculator = viewMethods.prepare();

                viewMethods.selectAction(calculator.getOperator(),
                        calculator.getNumber1(),
                        calculator.getNumber2());
            } else {
                ComplexCalculator complexCalculator = viewMethods.complexPrepare();

                viewMethods.selectAction(complexCalculator.getOperator(),
                        complexCalculator.getComplexNumber1(),
                        complexCalculator.getComplexNumber2());
            }
            flag = viewMethods.exitRequest();
        }
    }
}
