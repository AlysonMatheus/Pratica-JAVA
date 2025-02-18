package javacore.Threads.service;

import javacore.Threads.dominio.Membros;

public class EmailDeliveryService implements Runnable {
    private final Membros membros;

        public  EmailDeliveryService(Membros membros){
            this.membros = membros;
        }

    @Override
    public void run() {
            String threadName =Thread.currentThread().getName();
        System.out.println(threadName+ "starting to deliver emails...");

    }
}
