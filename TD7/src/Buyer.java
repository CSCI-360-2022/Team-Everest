
import java.util.ArrayList;
import java.util.Objects;

public class Buyer {
    public String name = "";
    private String userID = "";
    private  String paymentInfo = "";
    private String email = "";
    private String password = "";
    private Event[] events;
    private ArrayList<Ticket> boughtTickets;


    public void searchEvents(String query){
        for(int i = 0; i <= events.length; i++) {
            if (Objects.equals(events[i].getName(), query));
                System.out.println(events[i].getName());
        }
        System.out.println("no results found");
    }
    public void purchaseTicket(Ticket t1){
        boughtTickets.add(t1);
    }

}

