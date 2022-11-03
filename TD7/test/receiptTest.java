import org.testng.annotations.Test;

public class receiptTest {

    @Test
    public void printReceipt(){
        Receipt myReceipt = new Receipt();
        System.out.println("this is your total" + myReceipt.calculateTotal());

    }
    private double calculateTotal(int ticketCount){
        double ticketPrice = Ticket.getPrice();
        return ticketCount * ticketPrice;
    }


}




