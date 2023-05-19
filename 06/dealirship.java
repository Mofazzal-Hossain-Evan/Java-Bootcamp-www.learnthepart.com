import java.util.Scanner;

/**
 * dealirship
 */

public class dealirship {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to java !");
        System.out.println(" 1. Select option 'a' to buy a car");
        System.out.println(" 2. Select 'b' to sell a car");

        String option =scan.nextLine();

        switch (option) {
            case "a": //System.out.println("you chose opton "+ option); break;
                System.out.println("what is your budget?");
                int budget = scan.nextInt();
                if (budget >= 10000) {
                System.out.println("Great! A Nissan Car waiting for you!");
                System.out.println("\n Do you have insurance? write 'yes' or 'no'");
                scan.nextLine();
                String insurance = scan.nextLine();
                System.out.println("\n do you have driving license? write 'yes' or 'no'");
                String lincense = scan.nextLine();
                System.out.println("what is you score?");
                int creditScore = scan.nextInt();
                if (insurance.equals("yes") && lincense.equals("yes") && creditScore > 660 ){
                    System.out.println("SOLED!");
                } else {
                    System.out.println("We are sorry!");
                }

                } else {
                    System.out.println("see you again!");
                }
            break;    
            case "b": System.out.println("what is your valued at? ");
            int value = scan.nextInt(); 
            System.out.println("what is your selling price? ");
            int price = scan.nextInt();
            if(value > price && price < 30000) {
                System.out.println("we will buy your car, please");
            } else {
                System.out.println("we are not interested");
            }

            break;
                
            default:  System.out.println("Wrong option");
                
        }
        //scan.close();
    }
}