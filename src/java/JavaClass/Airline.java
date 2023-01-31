package JavaClass;

public class Airline {
    public String departure;
    public String destination;
    public String date;
    
    public Airline(String departure, String destination, String date){
        this.departure = departure;
        this.destination = destination;
        this.date = date;
    }
    
    public Airline(){
        
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
