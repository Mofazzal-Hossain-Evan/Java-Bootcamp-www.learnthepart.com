package carProject;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        String[] parts = {"tires","keys"};

        car nissan = new car("Nissan", 1000, 2020, "Green", parts);
        car dodge = new car("Dodge", 1234,1999,"Blue", parts);
        car nissan2 = new car(nissan);
        nissan2.setParts(new String[]{"tires","filter"});
        

        //parts[0] = "rimm";
        //System.out.println(Arrays.toString(nissan.parts));

       

     //String[] outsideVariable= nissan.getParts();
     //outsideVariable[1] = "hlw";

     System.out.println(Arrays.toString(nissan2.getParts()));
     System.out.println(nissan);
     System.out.println(dodge);
     System.out.println(nissan2);


        
    }
}
 