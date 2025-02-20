package Threads.Unterricht_examples._counter_notify_input_stream_reader;

public class Worker implements  Runnable{
    private final int sleepInterval = 100; //mse
    public int counter = 0;
    private static Object lock = new Object();

    private String input = null;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (counter < 100) {
                lock.notifyAll();
                System.out.println(Thread.currentThread().getName() +
                        " Counter   ---   " + counter++);
                try {
                    Thread.sleep(sleepInterval);
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.notifyAll(); // Releases all waiting Threads!
                if (input != null) {
                    break;
                }
            }
        }
    }

}
