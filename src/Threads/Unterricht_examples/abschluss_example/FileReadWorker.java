package Threads.Unterricht_examples.abschluss_example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWorker extends Worker implements Runnable{

    private String path;
    private Line line;
    private static Object lock = new Object();

    public FileReadWorker(String name, String path, Line line) {
        super(name);
        this.path = path;
        this.line = line;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                work();
            }
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void work() throws InterruptedException, IOException {
        printStarted();
        FileReader fr = new FileReader(new File(path));
        BufferedReader br = new BufferedReader(fr);
        String templine;

        while ((templine = br.readLine()) != null) {
            if (!shouldRun)
                break;
            line.addLine(templine);
            System.out.println(templine);
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName());
        }
        br.close();
        printStopped();
    }

}
