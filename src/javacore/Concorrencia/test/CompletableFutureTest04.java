package javacore.Concorrencia.test;

import javacore.Concorrencia.dominio.Quote;
import javacore.Concorrencia.service.StoreService;
import javacore.Concorrencia.service.StoreServiceWithDiscont;

import java.util.List;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscont service = new StoreServiceWithDiscont();
        searchPricesWithDiscount(service);

    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscont service) {


        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
     //   stores.forEach(s -> System.out.println(service.getPriceSynsc(s)));
    stores.stream()
            .map(service::getPriceSynsc)
            .map(Quote::newQuote)
            .map(service::applyDiscount)
            .forEach(System.out::println);
    }
}
