package view;

import util.ComplexCalculator;
import util.SimpleCalculator;
import util.ComplexNumber;

public interface Preparable {
    /**
     * Подготовка данных для ComplexCalculator
     */
    ComplexCalculator complexPrepare();

    /**
     * Подготовка данных для SimpleCalculator
     */
    SimpleCalculator prepare();

    /**
     * Метод запроса комплексного числа
     */
    ComplexNumber getComplexNumber(String message);
}
