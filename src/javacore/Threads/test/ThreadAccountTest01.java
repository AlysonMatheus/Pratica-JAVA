package javacore.Threads.test;

import javacore.Threads.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account accuont = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread  t1 = new Thread(threadAccountTest01,"Hestia");
        Thread  t2 = new Thread(threadAccountTest01,"Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdrawal(10);
            if (accuont.getBalance() < 0) {
                System.out.println("LASCOU");
            }
        }


    }


    private void withdrawal(int amount) {
        if (accuont.getBalance() >= amount) {
            System.out.println(getThreadName() + " esta indo sacar dinheiro");
            accuont.withdrawal(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da  conta " + accuont.getBalance());
        } else {
            System.out.println("Sem dinherio " + getThreadName() + " efetuar o saque " + accuont.getBalance());
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }


}

