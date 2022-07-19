package Threads.Unterricht_examples._counter_notify_input_stream_reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleHelper implements Runnable{
    Worker worker;

    public boolean isRunning = true;

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public ConsoleHelper(Worker worker) {
        this.worker = worker;
    }

    public static String readLine() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            return br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public void run() {
        System.out.println("Drücken Sie eine Taste um zu stoppen ...");
        String input;
        while ((input = ConsoleHelper.readLine()) != null && isRunning) {
            worker.setInput(input);
        }
    }

}
