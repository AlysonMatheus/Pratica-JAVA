package javacore.Comportamento.Interfaces;

import javacore.Comportamento.dominio.Car;
@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
    /// anonimas, funções, conciso
    //(parametro)-> <expressão>
    //(Car car) ->car.getColor(.equals("green");


}
