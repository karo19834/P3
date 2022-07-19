package Threads.Unterricht_examples.two_threads_synchronized_time_cpu__;


import java.util.Date;

public class Worker implements Runnable {
    private final int sleepIntervall = 1000; //sec

    private boolean isRunning = true;

    public void requestShutDown() {
        isRunning = false;
    }

    private static Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock) {
            while (isRunning) {
                Date d = new Date();
                System.out.print("[");
                System.out.println(Thread.currentThread().getName() + " ");
                System.out.print(d.toString());
                System.out.print(", CPUS: ");
                System.out.print(Runtime.getRuntime().availableProcessors());
                System.out.print(", FreeMem: ");
                System.out.print(Runtime.getRuntime().freeMemory());
                System.out.print("]");
                System.out.println();
                try {
                    Thread.sleep(sleepIntervall);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
