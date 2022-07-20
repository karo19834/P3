package nachpruefung;

import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException, StudentExportException {
        String path = "test.csv";
        String separator = ";";
        Student student1 = new Student("1", "Sascha", "sascha.leitner@gmx.at");
        Student student2 = new Student("2", "Robert", "robert.leitner@gmx.at");
        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.exportToCsv(path,separator);
    }

}
