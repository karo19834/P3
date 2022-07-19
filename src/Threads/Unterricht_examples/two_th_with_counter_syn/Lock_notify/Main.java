package Threads.Unterricht_examples.two_th_with_counter_syn.Lock_notify;

public class Main {
    public static void main(String[] args) {
        // COUNTER:
        Worker w1 = new Worker();
         Worker w2 = new Worker();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(w1.counter);
    }

}

