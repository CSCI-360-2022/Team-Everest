import jdk.internal.icu.text.UnicodeSet;
import org.junit.jupiter.api.Test;
import org.junit.Assert.*;
import java.util.LinkedList;

public class buyerTest {
    private Event[] events; // serves as local database
    private LinkedList<Ticket> boughtTickets; // serves as local database




    @Test
// When the user purchases a  ticket, the ticket should be added to
// the user's wallet/class or a property.
public void purchaseTicket(Ticket t1){
 boughtTickets.add(t1);
}


//
public void searchEvents(String query){
    for(int i = 0; i <= events.length; i++) {
        if (events[i].getName() == query)
            System.out.println(events[i].getName());
    }
    System.out.println("no results found");
    }



}



