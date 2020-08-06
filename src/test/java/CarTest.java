import javafx.beans.binding.BooleanExpression;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void ShouldFillWithGas() {
        Car car = new Car(10);
        assertEquals(0, car.gallons);
        car.fill(5);
        assertEquals(5, car.gallons);
        car.fill(6);
        assertEquals(11,car.gallons);

    }


    @Test
    public void ShouldUseGasWhenDriving() {
        Car car = new Car(10);
        car.fill(10);
        assertEquals(10, car.gallons);
        car.drive(50);
        assertEquals(5,car.gallons);
    }

    @Test
    public void ShouldIncrementOdometerWhenDriving() {
    Car car = new Car(10);
    assertEquals(0, car.odometer);
    car.drive(50);
    assertEquals(50,car.odometer);
    car.drive(25);
    assertEquals(75,car.odometer);
    }

    @Test
    public void ShouldRecordTripsWhenDriving() {
    Car car = new Car(10);
        ArrayList trips = new ArrayList();
    assertEquals(trips,car.trips);
      car.drive(50);
    assertEquals("[Trip: 50]", car.trips.toString());
    car.drive(25);
        assertEquals("[Trip: 50, Trip: 25]", car.trips.toString());
    }
    @Test
    public void testSaveRadioStations() {
        Car car = new Car(10);
        car.radioStations.put(1,"classic rock");


        assertEquals("{1=classic rock}", car.radioStations.toString());
    }

}
