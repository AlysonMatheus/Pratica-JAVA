package javacore.Concorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarResquest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 4.35D;

        });
        System.out.println(doSomenthing());
        Double dollarResponse = dollarResquest.get(3,TimeUnit.SECONDS);
        System.out.println("Dollar: " +dollarResponse);
        executorService.shutdown();
    }
    private static long doSomenthing(){
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum +=i;
        }
        return sum;

    }
}
