package Threads.Unterricht_examples._counter_notify_input_stream_reader;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // COUNTER:
        Worker w1 = new Worker();
        // Worker w2 = new Worker();
        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w1);
        t1.start();
        t2.start();

        /*
        System.out.println("Drücken Sie eine Taste um zu stoppen ...");
        if (at.campus02.pr3.threads.uebungen.ue1.ConsoleHelper.readLine() != null) {
            w1.requestShutDown();
        }
        */

        // USER INPUT:
        ConsoleHelper consoleHelper = new ConsoleHelper(w1);
        Thread t3 = new Thread(consoleHelper);
        t3.start();

        try {
            t1.join();
            System.out.println(t1.getName() + " " + t1.getState());
            t2.join();
            System.out.println(t2.getName() + " " + t2.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ZÄHLEN Fertig!");
        System.out.println("EINGABE: " + t3.getState());

        try {
            // t3.join();
            t3.interrupt(); // Alternative to t3.stop();
            System.out.println(consoleHelper.isRunning);
            consoleHelper.setRunning(false);
            System.out.println(consoleHelper.isRunning);
            System.out.println(t3.getName() + " " + t3.getState());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("EINGABE Fertig!");
        System.out.println(t3.getName() + " " + t3.getState());
        t3.interrupt();
        System.out.println("ENDE");
        System.out.println(t1.getName() + " " + t1.getState());
        System.out.println(t2.getName() + " " + t2.getState());
        System.out.println(t3.getName() + " " + t3.getState());
        System.out.println(w1.counter);

    }
}
