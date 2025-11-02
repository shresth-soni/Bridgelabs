package com.bridgelabz.oops.constructors;

class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You borrowed: " + title);
        } else {
            System.out.println("Sorry, " + title + " is not available.");
        }
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Available: " + available);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Guide", "Oracle", 450.0, true);
        b1.display();
        b1.borrowBook();
        b1.display();
    }
}
