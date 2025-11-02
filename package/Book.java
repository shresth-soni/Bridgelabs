// File: library/books/Book.java
package library.books;

public class Book {
    public String title, author;
    public Book(String t, String a) {
        title = t; author = a;
    }
    public void display() {
        System.out.println("Book: " + title + " by " + author);
    }
}
// File: library/members/Member.java
package library.members;

public class Member {
    public String name;
    public int id;
    public Member(String n, int i) {
        name = n; id = i;
    }
    public void display() {
        System.out.println("Member: " + name + " (ID: " + id + ")");
    }
}
// File: library/transactions/Transaction.java
package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void issueBook(Book b, Member m) {
        System.out.println(m.name + " issued the book " + b.title);
    }
}
