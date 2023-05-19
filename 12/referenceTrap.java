import java.util.Arrays;

/**
 * referenceTrap
 */
public class referenceTrap {

//     public static void main(String[] args) {
//         String[] staffLastYear = {"name1", "name 2","name 3","name 4"};
//         String[] staffThisYear = new String[3];
//         for(int i = 0; i < staffThisYear.length; i++) {
//             staffThisYear[i] = staffLastYear[i];
//             System.out.println(staffThisYear[i]);
//         }

//         staffThisYear[1]="44";

//         System.out.println(Arrays.toString(staffLastYear));
//         System.out.println(Arrays.toString(staffThisYear));
        
        
//     }

public static void main(String[] args) {
    String[] staffLastYear = {"name1", "name 2","name 3","name 4"};
    String[] staffThisYear = Arrays.copyOf(staffLastYear,staffLastYear.length );
    staffThisYear[1]="44";
    

   

    System.out.println(Arrays.toString(staffLastYear));
    System.out.println(Arrays.toString(staffThisYear));
    
    
}

}