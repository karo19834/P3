package Threads.Unterricht_examples.two_threads_synchronized_time_cpu__;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Console_Helper {
    public static String readLine() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            return br.readLine();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

}
