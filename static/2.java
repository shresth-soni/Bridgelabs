class Book {
    private static String libraryName = "Central Library";
    private final String isbn;
    private String title;
    private String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayDetails() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + this.isbn);
            System.out.println("Title: " + this.title);
            System.out.println("Author: " + this.author);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("ISBN001", "Java Basics", "James Gosling");
        b1.displayDetails();
        Book.displayLibraryName();
    }
}
