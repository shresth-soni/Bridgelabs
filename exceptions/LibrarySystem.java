import java.util.*;

class BookNotAvailableException extends Exception { public BookNotAvailableException(String m){super(m);} }
class InvalidReturnException extends Exception { public InvalidReturnException(String m){super(m);} }
class UserLimitExceededException extends Exception { public UserLimitExceededException(String m){super(m);} }

public class LibrarySystem {
    static Map<String, Boolean> books = new HashMap<>();
    static int borrowedBooks = 0;

    static {
        books.put("Java", true);
        books.put("Python", false);
    }

    public static void borrowBook(String book) throws BookNotAvailableException, UserLimitExceededException {
        if (borrowedBooks >= 5) throw new UserLimitExceededException("You have reached borrowing limit!");
        if (!books.getOrDefault(book, false)) throw new BookNotAvailableException("Book not available!");
        borrowedBooks++;
        books.put(book, false);
        System.out.println("Book borrowed: " + book);
    }

    public static void returnBook(String book) throws InvalidReturnException {
        if (!books.containsKey(book) || books.get(book)) throw new InvalidReturnException("Invalid return attempt!");
        books.put(book, true);
        borrowedBooks--;
        System.out.println("Book returned: " + book);
    }

    public static void main(String[] args) {
        try {
            borrowBook("Python");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
