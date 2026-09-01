////Question 3 — Online Ticket Booking

////Scenario: An online ticket booking system allows multiple customers to book seats
////simultaneously. Each booking request should execute in a separate thread.
////(a) Create a class TicketBooking containing a method bookTicket(String
////customerName). 
////(b) Create multiple threads representing different customers. 
////(c) Use synchronization to ensure that two customers cannot book the same seat
////simultaneously. 
////(d) Display the customer name and booking status. 
class TicketBooking {
    private int availableSeats = 1;

    // Synchronized method ensures only one customer can book at a time
    public synchronized void bookTicket(String customerName) {
        if (availableSeats > 0) {
            System.out.println(customerName + " is booking the ticket...");

            try {
                Thread.sleep(1000); // Simulate booking process
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            availableSeats--;

            System.out.println(
                    "Ticket successfully booked for " + customerName
            );
        } else {
            System.out.println(
                    "Sorry " + customerName + ", no seats are available."
            );
        }
    }
}

// Thread class representing a customer
class Customer extends Thread {
    private TicketBooking booking;
    private String customerName;

    Customer(TicketBooking booking, String customerName) {
        this.booking = booking;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        booking.bookTicket(customerName);
    }
}

// Main class
public class OnlineTicketBooking {
    public static void main(String[] args) {

        // Create one TicketBooking object
        TicketBooking booking = new TicketBooking();

        // Create multiple customer threads
        Customer c1 = new Customer(booking, "Rahul");
        Customer c2 = new Customer(booking, "Priya");
        Customer c3 = new Customer(booking, "Amit");

        // Start all threads
        c1.start();
        c2.start();
        c3.start();
    }
}
