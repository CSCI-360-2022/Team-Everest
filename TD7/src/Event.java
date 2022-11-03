public class Event {
    private String name = "";
    private String location = "";
    private String time = "";
    private boolean available = false;
    private int capacity = 0;


    public String getName(){
        return name;
    }

    public String getLocation() {
        return location;
    }

    public boolean available() {
        return available;
    }
}
