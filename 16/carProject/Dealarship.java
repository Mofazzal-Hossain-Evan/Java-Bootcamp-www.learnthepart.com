package carProject;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dealarship {

    private Car[] cars;

public Dealarship() {
    this.cars = new Car[3];
    //System.out.println(Arrays.toString(cars));
    
}

public void setCar(Car carr, int index) {
        this.cars[index] = new Car(carr);
//System.out.println(Arrays.toString(cars));

}
    
}
