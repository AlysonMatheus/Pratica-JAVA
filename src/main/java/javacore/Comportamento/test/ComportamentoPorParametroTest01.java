package javacore.Comportamento.test;

import javacore.Comportamento.dominio.Car;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
private static List<Car> cars = List.of(new Car("green",2011), new Car("black",1998), new Car("red",2019));
    public static void main(String[] args) {
        System.out.println( filterGreenCar(cars));
        System.out.println( filterCorByColor(cars,"green"));

        System.out.println( filterCorByColor(cars,"red"));
        System.out.println("--------------------------");
        System.out.println( filterAge(cars, 2015));


    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")){
                filterCars.add(car);
            }


        }
return filterCars;
    }
    private static List<Car> filterCorByColor(List<Car> cars,String cor){
        List<Car> filterCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)){
                filterCars.add(car);
            }

        }
        return filterCars;
    }
    private static List<Car> filterAge(List<Car> cars,int year){
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear()<year){
                oldCars.add(car);
            }

        }
        return oldCars;
    }


}
