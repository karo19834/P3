package nachpruefung;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void add(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "students=" + students +
                '}';
    }

    public void exportToCsv(String path, String separator) throws StudentExportException {

        BufferedWriter bufferedWriter = null;

        try {
            FileWriter fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Student s : getStudents()) {
                bufferedWriter.write(s.getId() + separator + s.getName()
                        + separator + s.getEmail());
                bufferedWriter.newLine();

                System.out.println("Student with ID: "+ s.getId() +" has been written to CSV file. " );
            }

            bufferedWriter.flush();

        } catch (IOException e) {
            throw new StudentExportException("File already exist ");
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
