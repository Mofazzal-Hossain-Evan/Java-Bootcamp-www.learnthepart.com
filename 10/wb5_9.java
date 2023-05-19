import java.util.Scanner;

public class wb5_9 {
    public static void main(String[] args) {
        
        String userName = "Samantha";
        String password = "java<3";

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Javagram! Sign in below \n");
        System.out.print("username: ");
        String Username = scan.nextLine();
        System.out.print("Password: ");
        String Password = scan.nextLine();

        while(!userName.equals(Username) && !Password.equals(password)){
            System.out.println("Incorrect, try again");
            System.out.print("username: ");
            Username = scan.nextLine();
            System.out.print("Password: ");
            Password = scan.nextLine();

        } 

        System.out.println("\nSign in successful. Welcome!");
        scan.close();


    }
}

// In Java, the exclamation mark symbol (!) is the logical negation operator. It negates the value of a boolean expression, meaning it reverses a true value to false and vice versa.

// In the example you provided, the expression inside the while loop uses the ! operator twice to negate the values returned by the equals method. 
// The equals method is used to check if two strings are equal in value. 
// So userName.equals(Username) returns true if the userName string is equal to the Username string, and false otherwise. Similarly, 
// Password.equals(password) returns true if the Password string is equal to the password string, and false otherwise.

// By negating the results of both these expressions using the ! operator, 
// the while loop continues as long as both the userName and Password strings are not equal to the Username and password strings, 
// respectively. In other words, the loop continues until the user enters the correct username and password.
