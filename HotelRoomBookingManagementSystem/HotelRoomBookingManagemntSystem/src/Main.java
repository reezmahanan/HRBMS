import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookingManager manager = new BookingManager();

        while (true) {
            System.out.println("===== Hotel Booking Management System =====");
            System.out.println("1. Add Booking");
            System.out.println("2. View All Bookings");
            System.out.println("3. Remove Booking");
            System.out.println("4. Search Booking");
            System.out.println("5. Checkout Booking");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Booking ID: ");
                    int bookingID = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Guest Name: ");
                    String guestName = scanner.nextLine();

                    System.out.print("Enter Room Number: ");
                    int roomNumber = scanner.nextInt();

                    System.out.print("Enter Number of Days: ");
                    int days = scanner.nextInt();
                    scanner.nextLine();

                    Booking newBooking = new Booking(bookingID, guestName, roomNumber, days, true);
                    manager.addBooking(newBooking);
                    System.out.println("Booking added successfully!\n");
                    break;

                case 2:
                    manager.displayAllBookings();
                    break;

                case 3:
                    System.out.print("Enter Booking ID to remove: ");
                    int removeID = scanner.nextInt();
                    scanner.nextLine();

                    boolean removed = manager.removeBooking(removeID);
                    if (removed) {
                        System.out.println("Booking removed successfully!\n");
                    } else {
                        System.out.println("Booking ID not found!\n");
                    }
                    break;

                case 4:
                    System.out.print("Enter Booking ID to search: ");
                    int searchID = scanner.nextInt();
                    scanner.nextLine();

                    Booking foundBooking = manager.findBooking(searchID);
                    if (foundBooking != null) {
                        System.out.println("Booking Found:");
                        foundBooking.displayBooking();
                        System.out.println();
                    } else {
                        System.out.println("Booking not found!\n");
                    }
                    break;

                case 5:
                    System.out.print("Enter Booking ID to checkout: ");
                    int checkoutID = scanner.nextInt();
                    scanner.nextLine();

                    boolean checkedOut = manager.checkoutBooking(checkoutID);
                    if (checkedOut) {
                        System.out.println("Checkout successful!\n");
                    } else {
                        System.out.println("Booking ID not found or already checked out!\n");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    System.out.println("Thank you for using Hotel Booking Management System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.\n");
            }
        }
    }
}