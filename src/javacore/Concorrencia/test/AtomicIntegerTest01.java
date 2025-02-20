package javacore.Concorrencia.test;

class Counter {
    private int count;
    void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class AtomicIntegerTest01 {
    public static void main(String[] args) {
        Counter counter = new Counter();

    }
}
