package com.bridgelabz.oops.accessmodifiers;

class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void display() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }

    public static void main(String[] args) {
        EBook e1 = new EBook("12345", "Learn Java", "James Gosling");
        e1.display();
    }
}
