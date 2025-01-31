package javacore.Comportamento.test;

import javacore.Comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(yearBeforeCars);
        List<Integer> nums =List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums,num -> num % 2 == 0 ));
    }
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filterredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filterredList.add(e);
            }
        }
        return filterredList;




}



   
}