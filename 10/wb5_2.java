import java.util.Scanner;

public class wb5_2{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bart's teacher wants him to write this line ninety-nine times");
        
        String Barts_detention = scan.nextLine();

        int i = 1;

        for( i = 1; i <= 99; i++){
            System.out.println(i +" "+ Barts_detention);
        }

    }
}
