package Threads.Unterricht_examples.abschluss_example;

import java.util.ArrayList;

public class Line {

    public ArrayList<String> lines = new ArrayList<>();

    public ArrayList<String> getLines() {
        return lines;
    }

    public void setLines(ArrayList<String> lines) {
        this.lines = lines;
    }

    public void addLine(String line){
        lines.add(line);
    }


}
