package carProject;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        String[] parts = new String[]{"tires","keys"};

        Car[] cars = new Car[] {
            new Car("Nissan", 1000, 2020, "Green", new String[]{"tires","filter"}),
            new Car("Dodge", 1234,1999,"Blue", new String[]{"tires","filter"}),
            new Car("Nissan", 1000, 2020, "Yeallo", new String[]{"tires","filter"})

        };


   //     nissan2.setParts(new String[]{"tires","filter"});
        

        //parts[0] = "rimm";
        //System.out.println(Arrays.toString(nissan.parts));

       

     //String[] outsideVariable= nissan.getParts();
     //outsideVariable[1] = "hlw";

     Dealarship dealarship = new Dealarship();

     for (int i = 0; i < cars.length; i++) {
        dealarship.setCar(cars[i], i);
        
     }
     //dealarship.setCar(cars[0], 0);
     //dealarship.setCar(cars[1], 1);
     //dealarship.setCar(cars[2], 2);


     

     //System.out.println(Arrays.toString(nissan2.getParts()));
     //System.out.println(nissan);
     //System.out.println(dodge);
     //System.out.println(nissan2);


        
    }
}
 