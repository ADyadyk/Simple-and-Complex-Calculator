package controller;

import model.repository.Calculable;
import model.repository.impl.ComplexNumberCalculatorRepository;
import model.repository.impl.SimpleCalculatorRepository;
import util.ComplexNumber;

public class CalculatorController<T> {
   private final Calculable<T> simpleCalculator = (Calculable<T>) new SimpleCalculatorRepository();
   private final Calculable<T> complexCalculator = (Calculable<T>) new ComplexNumberCalculatorRepository();

   public void multiplyController(T x, T y){
       if(x instanceof ComplexNumber){
           System.out.println(complexCalculator.multiply(x, y));
       } else {
           System.out.println(simpleCalculator.multiply(x, y));
       }
    }

   public void subtractionController(T x, T y){
       if(x instanceof ComplexNumber){
           System.out.println(complexCalculator.subtraction(x, y));
       } else {
           System.out.println(simpleCalculator.subtraction(x, y));
       }
   }

   public void sumController(T x, T y){
       if(x instanceof ComplexNumber){
           System.out.println(complexCalculator.sum(x, y));
       } else {
           System.out.println(simpleCalculator.sum(x, y));
       }
   }

   public void divideController(T x, T y){
       if(x instanceof ComplexNumber){
           System.out.println(complexCalculator.divide(x, y));
       } else {
           System.out.println(simpleCalculator.divide(x, y));
       }
   }
}
