import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings;

    public BookingManager() {
        bookings = new ArrayList<>();
    }


    public void addBooking(Booking booking) {
        bookings.add(booking);
    }


    public boolean removeBooking(int bookingID) {
        return bookings.removeIf(b -> b.getBookingID() == bookingID);
    }


    public boolean checkoutBooking(int bookingID) {
        for (Booking b : bookings) {
            if (b.getBookingID() == bookingID && b.isActive()) {
                b.checkout();
                return true;
            }
        }
        return false;
    }


    public void displayAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            for (Booking b : bookings) {
                b.displayBooking();
                System.out.println("-----");
            }
        }
    }


    public Booking findBooking(int bookingID) {
        for (Booking b : bookings) {
            if (b.getBookingID() == bookingID) {
                return b;
            }
        }
        return null;
    }
}
