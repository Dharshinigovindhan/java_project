// Defining the TicketCollector interface
interface TicketCollector {
    void checkTicket(String passengerName, String ticketNumber);
    void finePassenger(String passengerName, double fineAmount);
}

// Implementing the TicketCollector interface in the TrainTicketCollector class
class TrainTicketCollector implements TicketCollector {
    @Override
    public void checkTicket(String passengerName, String ticketNumber) {
        System.out.println("Checking ticket for passenger: " + passengerName);
        // Simulated check - this can be more complex if there is a ticket database
        if (ticketNumber.startsWith("TICKET")) {
            System.out.println("Ticket is valid for " + passengerName);
        } else {
            System.out.println("Invalid ticket for " + passengerName);
        }
    }

    @Override
    public void finePassenger(String passengerName, double fineAmount) {
        System.out.println("Issuing a fine of $" + fineAmount + " to passenger: " + passengerName);
    }
}

// Main class to test the TrainTicketCollector functionality
public class Main {
    public static void main(String[] args) {
        TrainTicketCollector collector = new TrainTicketCollector();
        
        // Example usage of the TrainTicketCollector methods
        collector.checkTicket("John Doe", "TICKET123");
        collector.checkTicket("Jane Smith", "INVALID123");
        
        // Issue a fine
        collector.finePassenger("John Doe", 50.0);
    }
}
