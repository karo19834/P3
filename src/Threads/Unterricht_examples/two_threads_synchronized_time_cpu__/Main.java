package Threads.Unterricht_examples.two_threads_synchronized_time_cpu__;

public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        t1.start();
        t2.start();

        System.out.println("Drücken Sie eine Taste um zu stoppen ...");
        if (Console_Helper.readLine() != null) {
            w1.requestShutDown();
        }
        if (Console_Helper.readLine() != null) {
            w2.requestShutDown();
        }

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Fertig!");
    }

}
