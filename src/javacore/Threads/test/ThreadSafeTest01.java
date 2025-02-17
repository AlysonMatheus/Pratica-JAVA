package javacore.Threads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNames{
    private final List<String> names =new ArrayList<>();

    public synchronized void add (String name){
       names.add(name);
    }
    public synchronized void removeFirts(){
        if (names.size()>0){
            System.out.println(Thread.currentThread().getName());
            System.out.println(names.remove(0));
        }
    }

}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
       ThreadSafeNames threadSafeNames = new ThreadSafeNames();
       threadSafeNames.add("Alyson");
       Runnable r = threadSafeNames::removeFirts;
       new Thread(r).start();
       new Thread(r).start();
    }
}
