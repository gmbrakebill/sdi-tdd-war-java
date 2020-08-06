import java.util.ArrayList;
import java.util.HashMap;

public class Car{
    int mpg;
    int gallons;
    int odometer;
    ArrayList<String> trips = new ArrayList<String>();
    HashMap<Integer, String> radioStations = new HashMap<Integer, String>();

    //Constructor for Car
    public Car(int mpg){
    this.mpg = mpg;
    }

    public void fill(int gas){
        this.gallons += gas;

    }

    public void drive(int miles){
    this.gallons -= (miles / this.mpg);
    this.odometer+= miles;
    this.trips.add("Trip: " + miles);
    }
    public void addStation(int station, String genre)
    {
        if(radioStations.size() < 6) {
            this.radioStations.put(station, genre);
        }
        else
        {
            
        }
    }

}
