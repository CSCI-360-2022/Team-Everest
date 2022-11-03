import org.testng.annotations.Test;
public class eventTest {
    private int ticketAvailability;


    @Test

    //
    public void singleEvent(){
        Event myEvent = new Event();
        System.out.println(myEvent.getName());
        System.out.println(myEvent.getLocation());
    }


    public boolean ticketAvailability(Event e1){
       return  e1.available();

    }
}
