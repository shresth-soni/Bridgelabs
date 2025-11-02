package com.bridgelabz.oops.leveltwo;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t1 = new MovieTicket("Inception", "A12", 300);
        t1.displayTicketDetails();
    }
}
