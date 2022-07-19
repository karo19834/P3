package Threads.Unterricht_examples.abschluss_example;

public class Demo {
    public static void main(String[] args) {
        Line line = new Line();
        TimePrintWorker timePrintWorker = new TimePrintWorker("TimePrintWorker");
        FileReadWorker fileReadWorker1 = new FileReadWorker("FileReadWorker-1",
                "test.txt", line);
        FileReadWorker fileReadWorker2 = new FileReadWorker("FileReadWorker-2",
                "test2.txt", line);
        Thread thread1 = new Thread(timePrintWorker);
        Thread thread2 = new Thread(fileReadWorker1);
        Thread thread3 = new Thread(fileReadWorker2);

        thread1.start();
        thread2.start();
        thread3.start();


        try {
            thread2.join();
            thread3.join();
            timePrintWorker.stopWorker();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(line.getLines());
        System.out.println("Fertig mit allen Arbeiten!");
    }


}
