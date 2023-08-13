package carProject;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        String[] parts = {"tires","keys"};

        car nissan = new car("Nissan", 1000, 2020, "Green", parts);
        car dodge = new car("Dodge", 1234,1999,"Blue", parts);
        

        //parts[0] = "rimm";
        //System.out.println(Arrays.toString(nissan.parts));
       

     String[] outsideVariable= nissan.getParts();
     outsideVariable[1] = "hlw";

     System.out.println(Arrays.toString(nissan.getParts()));


        
    }
}
 