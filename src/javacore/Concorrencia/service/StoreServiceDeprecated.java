package javacore.Concorrencia.service;

import java.util.concurrent.*;

public class StoreServiceDeprecated {
    public static final ExecutorService ex = Executors.newCachedThreadPool();

    public double getPriceSynsc(String Storename) {
        System.out.printf("Getting prices sync for store %s%n", Storename);
        return priceGenerator();
    }



    private double priceGenerator() {
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    public static void shutdown() {
        ex.shutdown();
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
