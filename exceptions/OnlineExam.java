import java.io.IOException;

class InvalidStudentException extends Exception { public InvalidStudentException(String m){super(m);} }

public class OnlineExam {
    public static void validateStudent(String name) throws InvalidStudentException {
        if (!name.equals("Shresth")) throw new InvalidStudentException("Invalid student name!");
    }

    public static void submitExam(String name) throws IOException, InvalidStudentException {
        validateStudent(name);
        throw new IOException("Error while uploading exam file!");
    }

    public static void main(String[] args) {
        try {
            submitExam("John");
        } catch (IOException | InvalidStudentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
