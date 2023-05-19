import java.util.Scanner;

public class wb5_8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = 3;
        System.out.print("I chose a number between 1 and 5. try to guess it: ");
        int secret = scan.nextInt();

        while(secret != number) {
            System.out.print("Guess again: ");
            secret = scan.nextInt();
        }
        System.out.println("you got it");
        scan.close();

    }
}
