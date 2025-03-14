package javacore.Concorrencia.test;

import javacore.Concorrencia.dominio.Quote;
import javacore.Concorrencia.service.StoreServiceWithDiscont;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest05 {
    public static void main(String[] args) {
        StoreServiceWithDiscont service = new StoreServiceWithDiscont();
        searchPricesWithDiscountAsync(service);

    }


    private static void searchPricesWithDiscountAsync(StoreServiceWithDiscont service) {

        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1", "Store 2", "Store 3", "Store 4");
        var completableFutures = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> service.getPriceSynsc(s)))
                .map(cf -> cf.thenApply(Quote::newQuote))
                .map(cf -> cf.thenCompose(quote -> CompletableFuture.supplyAsync(() -> service.applyDiscount(quote))))
                .map(cf -> cf.thenAccept(store -> System.out.printf("%s finished in %d%n", store, (System.currentTimeMillis() - start))))
                                .toArray(CompletableFuture[]::new);

//        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.allOf(completableFutures);
        CompletableFuture<Object> voidCompletableFuture = CompletableFuture.anyOf(completableFutures);
        voidCompletableFuture.join();
        System.out.printf("Finished? %b%n", voidCompletableFuture.isDone());


        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPrinceSync %dms%n", (end - start));

    }
}
