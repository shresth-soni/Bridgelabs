import java.util.*;

class InvalidSeatException extends Exception { public InvalidSeatException(String m){super(m);} }
class SeatAlreadyBookedException extends Exception { public SeatAlreadyBookedException(String m){super(m);} }

public class MovieBooking {
    static Map<Integer, Boolean> seats = new HashMap<>();
    static {
        for (int i = 1; i <= 5; i++) seats.put(i, true);
    }

    public static void bookSeat(int seatNo) throws InvalidSeatException, SeatAlreadyBookedException {
        if (!seats.containsKey(seatNo)) throw new InvalidSeatException("Invalid seat number!");
        if (!seats.get(seatNo)) throw new SeatAlreadyBookedException("Seat already booked!");
        seats.put(seatNo, false);
        System.out.println("Seat " + seatNo + " booked successfully!");
    }

    public static void main(String[] args) {
        try {
            bookSeat(6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
