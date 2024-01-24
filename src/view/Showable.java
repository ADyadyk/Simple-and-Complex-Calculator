package view;

public interface Showable<T> {
    /**
     * Выбор вида калькулятора
     */
    int selectCalculator();

    /**
     * Выбор операции вычисления
     */
    void selectAction(String operator, T x, T y);

    /**
     * Запрос на выход
     */
    boolean exitRequest();

    /**
     * Демонстрация возможных операций
     */
    void showOperators();

    /**
     * Выбор оператора
     */
    String selectOperator();
}
