package javacore.Concorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Alyson"));
        System.out.println(tq.offer("Alyson"));
        System.out.println(tq.offer("Alyson",10, TimeUnit.SECONDS));
        tq.put("Matheus");
        if (tq.hasWaitingConsumer()){
           tq.transfer("Matheus");
        }
        System.out.println(tq.tryTransfer("Martins"));
        System.out.println(tq.tryTransfer("Martins",5,TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.remainingCapacity());
    }
}
