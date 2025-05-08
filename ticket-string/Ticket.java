public class Ticket {
    public static void main(String[] args) {
        String firstName = "Sandy";
        String lastName = "Jones";
        String movieTitle = "The Source Code";
        int tickets = 8;
        double ticketPrice = 10.57;

        double totalPrice = 8 * 10.57;

        String username = firstName.toLowerCase() + lastName.toLowerCase();
        String movieName = movieTitle.toUpperCase();

        System.out.println("Congratulations!! You have successfully booked the tickets");
        System.out.println();
        System.out.println("Username: " + username);
        System.out.println("Movie: " + movieName);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Price per ticket: $" + ticketPrice);
        System.out.println("Total Price of " + tickets + " tickets: " + totalPrice);
        System.out.println();
        System.out.println("Thank you for choosing us for booking your movie tickets");
        System.out.println("Enjoy your movie!!!");
    }
}