package javacore.Lambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

// Referência a um método de instância de um objeto arbitrário de um tipo particular
public class MethodReferenceTest03 {
    public static void main(String[] args) {
      List<String> list = new ArrayList<>( List.of("Rimuru", "Veldora", "Hikimaru"));
      list.sort(String::compareTo);
        System.out.println(list);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>,String> checkName = List::contains;
        System.out.println(checkName.test(list,"Rimuru"));



    }
}
