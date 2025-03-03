package javacore.Concorrencia.test;


import java.util.concurrent.*;

class RandomNumblerCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        int num = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < num ; i++) {
            System.out.printf("%s executando uma tarefa callable...%n", Thread.currentThread().getName());
        }
        return String.format( "%s finished and the random number is %d",Thread.currentThread().getName(), num);
    }
}

public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandomNumblerCallable randomNumblerCallable = new RandomNumblerCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future = executorService.submit(randomNumblerCallable);
        String s = future.get();
        System.out.printf("Program finished %s", s);
        executorService.shutdown();

    }
}

