import java.time.*;

class LateSubmissionException extends Exception { public LateSubmissionException(String m){super(m);} }
class InvalidFileFormatException extends Exception { public InvalidFileFormatException(String m){super(m);} }

public class ExamSubmission {
    static LocalDateTime deadline = LocalDateTime.of(2025, 11, 10, 12, 0);

    public static void submitExam(String fileName, LocalDateTime submissionTime)
            throws LateSubmissionException, InvalidFileFormatException {
        if (!fileName.endsWith(".pdf"))
            throw new InvalidFileFormatException("Submission failed: invalid file format.");
        if (submissionTime.isAfter(deadline))
            throw new LateSubmissionException("Submission failed: late submission.");
        System.out.println("Exam submitted successfully!");
    }

    public static void main(String[] args) {
        try {
            submitExam("paper.docx", LocalDateTime.now());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
