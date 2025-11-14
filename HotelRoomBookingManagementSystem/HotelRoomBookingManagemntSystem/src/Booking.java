public class Booking {
    private int bookingID;
    private String guestName;
    private int roomNumber;
    private int days;
    private boolean isActive;




    // Parameterized constructor
    public Booking(int bookingID, String guestName, int roomNumber, int days, boolean isActive) {
        this.bookingID = bookingID;
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.days = days;
        this.isActive = true;
    }

    public int getBookingID() {

        return bookingID;
    }

    public void setBookingID(int bookingID) {

        this.bookingID = bookingID;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {

        this.guestName = guestName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }


    public void checkout(){
        this.isActive = false;
    }

    public void displayBooking() {
        String status = isActive ? "ACTIVE" : "CHECKED OUT";
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Days: " + days);
        System.out.println("Status: " + status);
    }

}


