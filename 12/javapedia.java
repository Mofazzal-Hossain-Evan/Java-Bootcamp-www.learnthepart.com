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
            System.out.print("\t . Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t . Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t . Occupation: ");
            database[i][2] = scan.nextLine();
            System.out.print("\n");

        }

         
    }
    
}
  