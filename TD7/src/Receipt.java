public class Receipt {
    int ticketCount = 0;
    private double total = 0.0;

    public double calculateTotal() {
        double ticketPrice = Ticket.getPrice();
        return this.total =  this.ticketCount * ticketPrice;
    }
}
