package model.repository;

public interface Calculable <T>{
    /**
     * Умножение
     */
    T multiply(T x, T y);

    /**
     * Вычитание
     */
    T subtraction(T x, T y);

    /**
     * Суммирование
     */
    T sum(T x, T y);

    /**
     * Деление
     */
    T divide(T x, T y);
}
