
package JavaClass;

public class AirlineArray {
    Airline[] airlines ;
    
    public AirlineArray(){
        airlines = new Airline[3];
        airlines[0] = new Airline("New York", "Kathmandu", "12/12/19");
        airlines[1] = new Airline("Pittsburg", "San Francisco", "10/10/19");
        airlines[2] = new Airline("Akron", "Miami", "11/11/19");
    }

    public Airline[] getAirlines() {
        return airlines;
    }
    
    
}
