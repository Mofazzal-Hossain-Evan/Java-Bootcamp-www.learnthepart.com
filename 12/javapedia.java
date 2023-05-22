import java.util.Arrays;
import java.util.Scanner;

public class javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n***********Javapedia**********");
        System.out.println("How many historical figures will you register?");

        int people = scan.nextInt();

        String[][] database = new String[people][3];

         scan.nextLine();
        for (int i =0; i < database.length; i++) {
            System.out.println("\n\tFigure: "+(i+1));
            System.out.print("\t . Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t . Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t . Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.print("\n");

        }

        System.out.println("These are the values you sored: ");
        print2Darray(database);
        System.out.println("\nWho do you want information on?");

        //scan.nextLine();
        String name = scan.nextLine();
        for (int i =0; i < database.length; i++) {
            if (database[i][0].equals(name)) {
                System.out.println("\tName: "+ database[i][0]);
                System.out.println("\tDate of birth: "+ database[i][1]);
                System.out.println("\tOccupation: "+ database[i][2]);
                
            }
        }

         
    }

    public static void print2Darray(String[][] array)  { 
        for (int i =0; i < array.length; i++ ) {
            System.out.println("\t");
            for (int j = 0; j < array[i].length; j++ ) {
                System.out.println((array[i][j])+" ");
                //
            }
            System.out.println("\n");
        }        
    }
    
}
  