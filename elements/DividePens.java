public class DividePens {
    public static void main(String[] args) {
        int pens = 14;
        int students = 3;
        int eachStudent = pens / students;
        int remaining = pens % students;

        System.out.println("Each student will get " + eachStudent + " pens.");
        System.out.println("Remaining (non-distributed) pens: " + remaining);
    }
}
